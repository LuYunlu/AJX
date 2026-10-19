package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.UserRagDocumentEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 用户RAG文档快照仓储接口
 * @author xhy
 * @date 2025-07-22 <br/>
 */
@Mapper
public interface UserRagDocumentRepository extends MyBatisPlusExtRepository<UserRagDocumentEntity> {

}