package org.a2o.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.user.model.AccountEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 账户仓储接口 */
@Mapper
public interface AccountRepository extends MyBatisPlusExtRepository<AccountEntity> {
}