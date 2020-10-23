/**   
 * @Title: UserController.java 
 * @Package com.xuyue.microservice.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月20日 下午2:57:14 
 * @version V1.0   
 */
package com.xuyue.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xuyue.microservice.po.User;
import com.xuyue.microservice.service.UserService;

/**
 * 类功能说明：TODO
 * <p>Title:UserController</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月20日 下午2:57:14
 * @version  v1.0
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;
    
    @RequestMapping("/userList")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteUser(id);
    }
    
    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
