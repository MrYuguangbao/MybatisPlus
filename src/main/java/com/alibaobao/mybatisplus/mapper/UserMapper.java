package com.alibaobao.mybatisplus.mapper;

import com.alibaobao.mybatisplus.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: admin
 * @Description: mapper接口
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus.mapper
 * @CreateTime: 2021-01-02 11:08:25
 */
@Repository("myUserMapper")
public interface UserMapper extends BaseMapper<User> {
}
