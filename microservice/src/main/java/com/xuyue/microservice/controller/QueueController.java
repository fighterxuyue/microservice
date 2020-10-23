/**   
 * @Title: QueueController.java 
 * @Package com.xuyue.microservice.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月22日 下午2:45:04 
 * @version V1.0   
 */
package com.xuyue.microservice.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能说明：TODO
 * <p>Title:QueueController</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月22日 下午2:45:04
 * @version  v1.0
 */
@RestController
public class QueueController
{
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    
    @Autowired
    private ActiveMQQueue queue;
    
    @RequestMapping("/send")
    public void send() {
        jmsMessagingTemplate.convertAndSend(queue, "新发送的消息！");
    }
    
}
