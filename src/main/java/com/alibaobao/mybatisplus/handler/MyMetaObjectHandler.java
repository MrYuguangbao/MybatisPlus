package com.alibaobao.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: admin
 * @Description: 数据填充处理-元数据处理实现类
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus.handler
 * @CreateTime: 2021-01-04 22:15:11
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insertfill......");
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start updatefill......");
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
