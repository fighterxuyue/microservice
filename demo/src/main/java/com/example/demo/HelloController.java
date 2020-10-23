/**
 * 
 */
package com.example.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.GroupingCaller;

/**
 * @author tony
 *
 */
@RestController
@PropertySource(value = "config.properties")
public class HelloController {

    @Value("${start.path}")
    private String startPath;
    
    @Value("${stop.path}")
    private String stopPath;
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!!";
    }
	
    @GetMapping("/start")
    public Map startUp() {
        Map msg=new HashMap();
        String locationCmd=startPath;//"cmd /c start "+
        try {
            Process child =Runtime.getRuntime().exec(locationCmd);
            //child.destroy();
            msg.put("msg", "调用start.bat成功!");
        } catch (IOException e) {
            e.printStackTrace();
            msg.put("msg", "调用start.bat出错,执行命令为："+locationCmd);
        }
        return msg;
    }
    
    @PostMapping("/stopservice")
    public Map stopservice() {
        Map msg=new HashMap();
        try
        {
            String  result= GroupingCaller.callGroupingSvc(stopPath, "");
            System.out.println("result:"+result);
            msg.put("msg", "停止python服务成功！");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            msg.put("msg","停止python服务成功！");
        }
        return msg;
    }
}
