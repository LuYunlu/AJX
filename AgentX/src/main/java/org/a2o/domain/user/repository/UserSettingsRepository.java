package org.a2o.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.user.model.UserSettingsEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 用户设置仓储接口 */
@Mapper
public interface UserSettingsRepository extends MyBatisPlusExtRepository<UserSettingsEntity> {

}