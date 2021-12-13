package com.pure.common.exception;

import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 断言
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-09 14:14:00
 */
@Slf4j
public class PureAssert {

    private PureAssert() {
    }

    public static void notNull(Object obj, String objName) {
        if (ObjectUtil.isEmpty(obj)) {
            log.warn(objName);
            throw new PureException(objName);
        }
    }

    public static void notEquals(Object obj1, Object obj2, String msg) {
        if (!obj1.equals(obj2)) {
            throw new PureException(msg );
        }
    }
}
