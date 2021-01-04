package com.alibaobao.mybatisplus;

import com.alibaobao.mybatisplus.mapper.UserMapper;
import com.alibaobao.mybatisplus.model.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: admin
 * @Description: 测试类
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.alibaobao.mybatisplus
 * @CreateTime: 2021-01-02 11:09:50
 */
@SpringBootTest(classes = MybatisplusApplication.class)
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
        System.out.println("开始mybatisplus测试");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelect(){
        /*User user = userMapper.selectById(2L);
        System.out.println(user);*/

        List<User> users = userMapper.selectBatchIds(Arrays.asList(1346089621397704708L));

        /*Map<String, Object> map = new HashMap<>();
        map.put("name","Lemeo");
        map.put("age","20");
        List<User> users = userMapper.selectByMap(map);*/
        users.forEach(System.out::println);
    }

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);
    }

    @Test
    public void testDelete(){
        userMapper.deleteById(1346089621397704708L);
    }

    @Test
    public void testPerfor(){
        PerformanceInterceptor interceptor = new PerformanceInterceptor();
        interceptor.setMaxTime(1);
        interceptor.setFormat(true);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("ooolkj");
        user.setAge(16);
        user.setEmail("124987@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1346089621397704709L);
        user.setName("aidkjf更新1");
        user.setAge(29);
        int result = userMapper.updateById(user);
        System.out.println(result);
    }

    @Test
    public void testOpmisticLock(){
        User user = userMapper.selectById(6L);
        user.setName("aidkjf更新optimistic333");

        User user1 = userMapper.selectById(6L);
        user1.setName("aidkjf更新optimistic1111");
        userMapper.updateById(user1);

        int result = userMapper.updateById(user);
        System.out.println(result);
    }

    @Test
    public void testWrapper(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        /*wrapper.isNotNull("name").isNotNull("email").ge("age", 10);
        List<User> users = userMapper.selectList(wrapper);*/

        wrapper.likeRight("name","J");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);

    }

}
