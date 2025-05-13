package org.ylzl.eden.spring.framework.expression.function;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * @Auther: Zywoo Lee
 * @Date: 2025-05-13 10:48
 * @Description:
 */
@Data
public class CustomMethod {

    private String registerName;

    private Method method;


}
