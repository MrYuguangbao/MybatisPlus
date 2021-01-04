package com.alibaobao.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.boot.SpringBootVersion;

import java.util.Date;

/**
 * @Author: admin
 * @Description: 用户实体类
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus.model
 * @CreateTime: 2021-01-02 11:05:09
 */
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @Version
    private Integer version;
    @TableLogic
    private Integer deleted;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
