package org.a2o.domain.llm.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.llm.model.ProviderEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 服务提供商仓储接口 */
@Mapper
public interface ProviderRepository extends MyBatisPlusExtRepository<ProviderEntity> {

}