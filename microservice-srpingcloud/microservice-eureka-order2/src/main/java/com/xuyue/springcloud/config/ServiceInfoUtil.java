/**   
 * @Title: ServiceInfoUtil.java 
 * @Package com.xuyue.springcloud.config 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月23日 下午1:27:53 
 * @version V1.0   
 */
package com.xuyue.springcloud.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 类功能说明：TODO
 * <p>Title:ServiceInfoUtil</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 下午1:27:53
 * @version  v1.0
 */
//Spring Boot2.0以上版本EmbeddedServletContainerCustomizer被WebServerFactoryCustomizer替代
@Component
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent>
{
    private static int serverPort;

    public static String getUrl() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "http://"+ address.getHostAddress() +":"+serverPort;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        serverPort = event.getWebServer().getPort();
    }

}
