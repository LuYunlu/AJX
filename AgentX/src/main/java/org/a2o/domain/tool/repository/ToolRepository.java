package org.a2o.domain.tool.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.tool.model.ToolEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 工具仓储接口 */
@Mapper
public interface ToolRepository extends MyBatisPlusExtRepository<ToolEntity> {
}