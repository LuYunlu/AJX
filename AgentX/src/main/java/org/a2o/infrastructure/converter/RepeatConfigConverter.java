package org.a2o.infrastructure.converter;

import org.apache.ibatis.type.MappedTypes;
import org.a2o.domain.scheduledtask.model.RepeatConfig;

/** 重复配置转换器 */
@MappedTypes(RepeatConfig.class)
public class RepeatConfigConverter extends JsonToStringConverter<RepeatConfig> {

    public RepeatConfigConverter() {
        super(RepeatConfig.class);
    }
}