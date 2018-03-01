/**
 * 
 */
package com.studentapp.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kelvin sajere
 *
 */
@Controller
@RequestMapping(path="/")
public class IndexController {
	
	public String index() {
		return "index";
		
	}

}
