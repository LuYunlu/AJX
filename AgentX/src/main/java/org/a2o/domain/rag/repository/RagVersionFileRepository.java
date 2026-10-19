package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.RagVersionFileEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** RAG版本文件仓储接口
 * @author xhy
 * @date 2025-07-16 <br/>
 */
@Mapper
public interface RagVersionFileRepository extends MyBatisPlusExtRepository<RagVersionFileEntity> {

}