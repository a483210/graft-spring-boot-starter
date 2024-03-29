package com.psd.graft.annotation;

import com.psd.graft.event.EventType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 发送事件
 *
 * @author Created by gold on 2019/10/11 09:38
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PostEvent {

    /**
     * tag区分
     */
    String value() default EventType.DEFAULT_TAG;

}

