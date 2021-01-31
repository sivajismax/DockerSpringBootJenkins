
package com.sivaji.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V1")
public class Mycontroller {

	@RequestMapping("/testrest")
	public String getDefault()
	{
		return "Hello! Docker is running successful for SpringBoot Applicationssssssssss";
	}
}
