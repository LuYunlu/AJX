package org.a2o.domain.order.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.order.model.OrderEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 订单仓储接口 */
@Mapper
public interface OrderRepository extends MyBatisPlusExtRepository<OrderEntity> {
}