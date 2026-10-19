package org.a2o.domain.rag.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.rag.model.FileDetailEntity;
import org.a2o.domain.rag.model.RagQaDatasetEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** @author shilong.zang
 * @date 17:44 <br/>
 */
@Mapper
public interface RagQaDatasetRepository extends MyBatisPlusExtRepository<RagQaDatasetEntity> {

}
