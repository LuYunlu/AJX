package org.a2o.domain.rule.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rule.model.RuleEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 规则仓储接口 */
@Mapper
public interface RuleRepository extends MyBatisPlusExtRepository<RuleEntity> {
}