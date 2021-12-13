package com.pure.base.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * mybatisPlus自动填充
 *
 * @author zmy
 * @version V1.0
 * @since 2021-12-09 11:28:00
 */

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 为插入语句指定字段添加属性值
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        Date date = new Date();
        setFieldValByName("createTime", date, metaObject);
        setFieldValByName("updateTime", date, metaObject);
        setFieldValByName("isDeleted", (byte) 1, metaObject);
    }

    /**
     * 为更新语句指定字段添加属性值
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        Date date = new Date();
        setFieldValByName("updatedTime", date, metaObject);
    }
}
