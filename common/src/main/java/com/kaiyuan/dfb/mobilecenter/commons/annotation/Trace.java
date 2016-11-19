package com.kaiyuan.dfb.mobilecenter.commons.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * 检测token
 *
 * @author yangzhibin@che001.com
 * @date 2016/7/12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//注解表明这个注解应该被 javadoc工具记录
@Documented
//最高优先级
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface Trace {
    boolean isValidate() default true;
    String traceId() default "";
    String spanId() default "";
    String parentId() default "";
}