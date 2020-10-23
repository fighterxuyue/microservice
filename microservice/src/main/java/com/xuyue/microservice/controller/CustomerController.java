/**   
 * @Title: CustomerController.java 
 * @Package com.xuyue.microservice.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月22日 下午2:59:34 
 * @version V1.0   
 */
package com.xuyue.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能说明：TODO
 * <p>Title:CustomerController</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月22日 下午2:59:34
 * @version  v1.0
 */
@RestController
public class CustomerController
{
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    
    @JmsListener(destination = "active.queue")//指定监听的目的地
    public void readActiveQueue(String message) {
        System.out.println("接收到："+message);
    }
}
