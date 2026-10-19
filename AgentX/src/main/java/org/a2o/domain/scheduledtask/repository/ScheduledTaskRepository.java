package org.a2o.domain.scheduledtask.repository;

import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.scheduledtask.model.ScheduledTaskEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 定时任务仓储接口 */
@Mapper
public interface ScheduledTaskRepository extends MyBatisPlusExtRepository<ScheduledTaskEntity> {
}