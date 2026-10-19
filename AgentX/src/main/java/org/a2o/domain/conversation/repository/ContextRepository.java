package org.a2o.domain.conversation.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.conversation.model.ContextEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 上下文仓库接口 */
@Mapper
public interface ContextRepository extends MyBatisPlusExtRepository<ContextEntity> {
}