package com.snehal.springboot.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesageDisplayController {
    @RequestMapping("/hello")
	public String display() {
		return "Hello Everyone";
		
	}
   
}
