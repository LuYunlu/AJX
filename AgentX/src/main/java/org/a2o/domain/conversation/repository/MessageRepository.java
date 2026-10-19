package org.a2o.domain.conversation.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.a2o.domain.conversation.model.MessageEntity;
import org.a2o.infrastructure.repository.MyBatisPlusExtRepository;

/** 消息仓库接口 */
@Mapper
public interface MessageRepository extends MyBatisPlusExtRepository<MessageEntity> {
}