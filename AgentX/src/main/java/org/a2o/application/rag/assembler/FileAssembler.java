package org.a2o.application.rag.assembler;

import org.a2o.domain.rag.model.FileDetailEntity;
import org.a2o.interfaces.dto.rag.RagUploadRequest;

/** @author shilong.zang
 * @date 11:09 <br/>
 */
public class FileAssembler {

    /** 将CreateAgentRequest转换为AgentEntity */
    public static FileDetailEntity toEntity(RagUploadRequest request) {

        FileDetailEntity fileDetailEntity = new FileDetailEntity();
        fileDetailEntity.setMultipartFile(request.getFile());
        fileDetailEntity.setDataSetId(request.getDataSetId());

        return fileDetailEntity;
    }
}
