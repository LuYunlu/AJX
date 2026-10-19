package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.RagVersionDocumentEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** RAG版本文档单元仓储接口
 * @author xhy
 * @date 2025-07-16 <br/>
 */
@Mapper
public interface RagVersionDocumentRepository extends MyBatisPlusExtRepository<RagVersionDocumentEntity> {

}