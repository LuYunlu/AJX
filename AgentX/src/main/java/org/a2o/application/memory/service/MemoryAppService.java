package org.a2o.application.memory.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import org.a2o.application.memory.assembler.MemoryAssembler;
import org.a2o.application.memory.dto.MemoryItemDTO;
import org.a2o.domain.memory.model.CandidateMemory;
import org.a2o.domain.memory.model.MemoryItemEntity;
import org.a2o.domain.memory.service.MemoryDomainService;
import org.a2o.interfaces.dto.memory.CreateMemoryRequest;
import org.a2o.interfaces.dto.memory.QueryMemoryRequest;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryAppService {

    private final MemoryDomainService memoryDomainService;

    public MemoryAppService(MemoryDomainService memoryDomainService) {
        this.memoryDomainService = memoryDomainService;
    }

    /** 分页列出用户记忆 */
    public Page<MemoryItemDTO> listUserMemories(String userId, QueryMemoryRequest request) {
        int pageNo = request.getPage() != null ? request.getPage() : 1;
        int pageSize = request.getPageSize() != null ? request.getPageSize() : 20;
        Page<MemoryItemEntity> page = memoryDomainService.pageMemories(userId, request.getType(), pageNo, pageSize);
        Page<MemoryItemDTO> dtoPage = new Page<>(page.getCurrent(), page.getSize(), page.getTotal());
        dtoPage.setRecords(MemoryAssembler.toDTOs(page.getRecords()));
        return dtoPage;
    }

    /** 手动创建记忆 */
    public List<String> createMemory(String userId, CreateMemoryRequest request) {
        CandidateMemory cm = org.a2o.application.memory.assembler.MemoryCommandAssembler.toCandidate(request);
        List<CandidateMemory> list = new ArrayList<>();
        list.add(cm);
        return memoryDomainService.saveMemories(userId, null, list);
    }

    /** 归档（软删除）记忆 */
    public boolean deleteMemory(String userId, String itemId) {
        return memoryDomainService.delete(userId, itemId);
    }
}
