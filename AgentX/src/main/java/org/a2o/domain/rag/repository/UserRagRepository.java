package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.UserRagEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 用户安装的RAG仓储接口
 * @author xhy
 * @date 2025-07-16 <br/>
 */
@Mapper
public interface UserRagRepository extends MyBatisPlusExtRepository<UserRagEntity> {

}