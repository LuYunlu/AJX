package org.a2o.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.user.model.UsageRecordEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 用量记录仓储接口 */
@Mapper
public interface UsageRecordRepository extends MyBatisPlusExtRepository<UsageRecordEntity> {
}