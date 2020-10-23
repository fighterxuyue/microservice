/**   
 * @Title: UserServiceImpl.java 
 * @Package com.xuyue.microservice.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月20日 下午3:21:57 
 * @version V1.0   
 */
package com.xuyue.microservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xuyue.microservice.dao.UserMapper;
import com.xuyue.microservice.po.User;
import com.xuyue.microservice.service.UserService;

/**
 * 类功能说明：TODO
 * <p>Title:UserServiceImpl</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月20日 下午3:21:57
 * @version  v1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value="UserCache",key="'user.getAllUsers'")
    public List<User> getAllUsers()
    {
        return userMapper.getAllUsers();
    }

    @Override
    @CacheEvict(value="UserCache",key="'user.getAllUsers'")
    public int deleteUser(Integer id)
    {
        return userMapper.deleteUser(id);
    }

    @Override
    public User getUserById(Integer id)
    {
        return userMapper.selectByPrimaryKey(id);
    }
    
}
