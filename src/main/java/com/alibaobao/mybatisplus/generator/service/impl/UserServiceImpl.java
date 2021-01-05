package com.alibaobao.mybatisplus.generator.service.impl;

import com.alibaobao.mybatisplus.generator.entity.User;
import com.alibaobao.mybatisplus.generator.mapper.UserMapper;
import com.alibaobao.mybatisplus.generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author artist
 * @since 2021-01-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
