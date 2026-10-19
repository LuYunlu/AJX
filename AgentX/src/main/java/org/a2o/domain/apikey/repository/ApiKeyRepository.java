package org.a2o.domain.apikey.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.apikey.model.ApiKeyEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** API密钥仓储接口 */
@Mapper
public interface ApiKeyRepository extends MyBatisPlusExtRepository<ApiKeyEntity> {
}