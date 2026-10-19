package org.a2o.domain.trace.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.trace.model.AgentExecutionSummaryEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** Agent执行链路汇总仓库接口 */
@Mapper
public interface AgentExecutionSummaryRepository extends MyBatisPlusExtRepository<AgentExecutionSummaryEntity> {
}