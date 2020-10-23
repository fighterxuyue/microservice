/**   
 * @Title: UserService.java 
 * @Package com.xuyue.microservice.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月20日 下午3:18:32 
 * @version V1.0   
 */
package com.xuyue.microservice.service;

import java.util.List;
import com.xuyue.microservice.po.User;

/**
 * 类功能说明：TODO
 * <p>Title:UserService</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月20日 下午3:18:32
 * @version  v1.0
 */
public interface UserService
{
    /**
     * 
     * @Title:getAllUsers
     * @Description:查询所有用户
     * @return List<User> 返回类型
     */
    List<User> getAllUsers();
    
    /**
     * 
     * @Title:deleteUser
     * @Description:TODO
     * @param 根据id删除用户数据
     * @return int 返回类型
     */
    int deleteUser(Integer id);
    
    /**
     * 
     * @Title:getUserById
     * @Description:TODO
     * @param id
     * @return User 返回类型
     */
    User getUserById(Integer id);
}
