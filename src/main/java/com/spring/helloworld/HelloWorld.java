/**
 * 
 */
package com.spring.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Srinivas Renduchinthala
 *
 */

@Controller
public class HelloWorld {
	
	@RequestMapping("/")
	public String helloWorld() {
		return "index";
	}
}
