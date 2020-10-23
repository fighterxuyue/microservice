/**   
 * @Title: OrderController.java 
 * @Package com.xuyue.springcloud.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午11:06:47 
 * @version V1.0   
 */
package com.xuyue.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xuyue.springcloud.po.Order;

/**
 * 类功能说明：TODO
 * <p>Title:OrderController</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午11:06:47
 * @version  v1.0
 */
@RestController
public class OrderController
{
    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id) {
        Order order=new Order();
        order.setId("123");
        order.setPrice(123.6);
        order.setReceiverName("金翅大鹏");
        order.setReceiverAddress("蓬莱仙岛");
        order.setReceiverPhone("18612425645");
        return order.toString();
    }
}
