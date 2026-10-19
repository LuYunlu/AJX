package org.a2o.domain.agent.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.a2o.domain.agent.model.AgentWidgetEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

import java.util.List;

/** Agent小组件配置仓储接口 */
@Mapper
public interface AgentWidgetRepository extends MyBatisPlusExtRepository<AgentWidgetEntity> {

}