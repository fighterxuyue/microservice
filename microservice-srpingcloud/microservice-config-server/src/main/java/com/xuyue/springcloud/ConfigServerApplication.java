package com.xuyue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 类功能说明：TODO
 * <p>Title:EurekaApplication</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午9:30:51
 * @version  v1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication
{
    
    /** 
     * @Title:main
     * @Description:TODO
     * @param args 
     * @return void 返回类型
     */
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigServerApplication.class);
    }
    
}
