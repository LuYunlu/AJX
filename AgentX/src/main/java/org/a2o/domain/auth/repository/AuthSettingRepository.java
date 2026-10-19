package org.a2o.domain.auth.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.auth.model.AuthSettingEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 认证配置Repository接口 */
@Mapper
public interface AuthSettingRepository extends MyBatisPlusExtRepository<AuthSettingEntity> {
}