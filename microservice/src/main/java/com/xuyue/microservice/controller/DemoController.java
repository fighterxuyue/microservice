/**
 * 
 */
package com.xuyue.microservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tony
 *
 */
@RestController
public class DemoController {

	@PostMapping("/stopservice")
	public String stopservice() {
		System.out.println("停止服务.....");
		return "stopservice";
	}
}
