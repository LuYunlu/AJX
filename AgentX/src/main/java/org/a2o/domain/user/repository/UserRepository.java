package org.a2o.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.user.model.UserEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 模型仓储接口 */
@Mapper
public interface UserRepository extends MyBatisPlusExtRepository<UserEntity> {

}