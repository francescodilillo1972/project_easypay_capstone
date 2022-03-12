package com.easypay.dockerspringwebboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Math;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {
	
	@GetMapping
	public String home() {
		double x = 0.0001;
		for (int i=0; i<1000000; i++){
			x += Math.sqrt(x);
		}
		return "Hello from EasyPay. CPU Load has been increased";
	}
}

