package org.a2o.domain.llm.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.llm.model.ModelEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 模型仓储接口 */
@Mapper
public interface ModelRepository extends MyBatisPlusExtRepository<ModelEntity> {

}