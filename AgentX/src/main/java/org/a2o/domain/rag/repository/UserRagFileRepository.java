package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.UserRagFileEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 用户RAG文件快照仓储接口
 * @author xhy
 * @date 2025-07-22 <br/>
 */
@Mapper
public interface UserRagFileRepository extends MyBatisPlusExtRepository<UserRagFileEntity> {

}