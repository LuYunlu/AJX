package org.a2o.domain.tool.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.tool.model.ToolVersionEntity;
import org.a2o.domain.tool.model.UserToolEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

@Mapper
public interface UserToolRepository extends MyBatisPlusExtRepository<UserToolEntity> {
}
