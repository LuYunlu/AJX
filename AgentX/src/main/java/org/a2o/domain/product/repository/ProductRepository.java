package org.a2o.domain.product.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.product.model.ProductEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 商品仓储接口 */
@Mapper
public interface ProductRepository extends MyBatisPlusExtRepository<ProductEntity> {
}