package org.a2o.domain.trace.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.trace.model.AgentExecutionDetailEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** Agent执行链路详细记录仓库接口 */
@Mapper
public interface AgentExecutionDetailRepository extends MyBatisPlusExtRepository<AgentExecutionDetailEntity> {
}