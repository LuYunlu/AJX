package org.a2o.domain.memory.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.memory.model.MemoryItemEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** memory_items 表数据访问（基于 MyBatis-Plus 提供通用 CRUD） */
@Mapper
public interface MemoryItemRepository extends MyBatisPlusExtRepository<MemoryItemEntity> {
}
