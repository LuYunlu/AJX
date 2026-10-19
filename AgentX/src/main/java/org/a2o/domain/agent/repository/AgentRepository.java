package org.a2o.domain.agent.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.agent.model.AgentEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** Agent仓库接口 */
@Mapper
public interface AgentRepository extends MyBatisPlusExtRepository<AgentEntity> {
}