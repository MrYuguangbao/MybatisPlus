package com.alibaobao.mybatisplus;

import com.alibaobao.mybatisplus.mapper.UserMapper;
import com.alibaobao.mybatisplus.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: admin
 * @Description: 测试类
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus
 * @CreateTime: 2021-01-02 11:09:50
 */
@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
        System.out.println("开始mybatisplus测试");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
