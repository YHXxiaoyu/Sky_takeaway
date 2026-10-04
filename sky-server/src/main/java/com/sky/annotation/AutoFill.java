package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // 注解属性，指定操作类型（INSERT/UPDATE），用于标识需要自动填充的功能字段（如 createTime、updateTime 等）
    // 由于属性名为 value，使用时可省略属性名，直接写：@AutoFill(OperationType.INSERT)
    OperationType value();

}
