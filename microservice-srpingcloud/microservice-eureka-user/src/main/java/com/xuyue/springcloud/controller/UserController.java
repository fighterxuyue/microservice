/**   
 * @Title: UserController.java 
 * @Package com.xuyue.springcloud.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午10:55:15 
 * @version V1.0   
 */
package com.xuyue.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类功能说明：TODO
 * <p>Title:UserController</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午10:55:15
 * @version  v1.0
 */
@RestController
public class UserController
{
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/findOrdersByUser/{id}")
    public String findOrdersByUser(@PathVariable String id) {
        int oid=123;
        return restTemplate.getForObject("http://localhost:7900/order/"+oid, String.class);
    }
}
