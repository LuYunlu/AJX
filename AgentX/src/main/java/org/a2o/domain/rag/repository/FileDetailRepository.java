package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.FileDetailEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 文件详情仓库接口
 * @author zang */
@Mapper
public interface FileDetailRepository extends MyBatisPlusExtRepository<FileDetailEntity> {

}