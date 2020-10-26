package com.xuyue.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能说明：TODO
 * <p>Title:EurekaApplication</p>
 * @author  xuyue fighterxuyue@163.com
 * @date 2020年10月23日 上午9:30:51
 * @version  v1.0
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication
{
    @Value("${clientParam}")
    private String clientParam;
    
    @GetMapping("/clientParam")
   public String getParam() {
       return clientParam;
   }
    
   @RequestMapping("/hello")
   public String hello() {
       return "Hello World!";
   }
    
    /** 
     * @Title:main
     * @Description:TODO
     * @param args 
     * @return void 返回类型
     */
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClientApplication.class);
    }
    
}
