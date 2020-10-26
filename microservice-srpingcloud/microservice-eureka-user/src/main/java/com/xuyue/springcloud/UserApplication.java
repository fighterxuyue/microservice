/**   
 * @Title: Application.java 
 * @Package com.xuyue.springcloud 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午9:59:37 
 * @version V1.0   
 */
package com.xuyue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 类功能说明：TODO
 * <p>Title:Application</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午9:59:37
 * @version  v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApplication
{
    
    /** 
     * @Title:main
     * @Description:TODO
     * @param args 
     * @return void 返回类型
     */
    public static void main(String[] args)
    {
        SpringApplication.run(UserApplication.class);
    }
    
    /**
     * 
     * @Title:restTemplate
     * @Description:创建RestTemplate实例
     * @return RestTemplate 返回类型
     */
    @Bean
    @LoadBalanced//开启负载
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
