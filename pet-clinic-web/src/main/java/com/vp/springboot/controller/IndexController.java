/**
 * 16-Sep-2018
 * praveen-vp
 * IndexController.java		
 */
package com.vp.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
@Controller
public class IndexController {

	@RequestMapping({ "", "/", "index", "index.html" })
	public String index() {

		return "index";
	}

	@RequestMapping("/oups")
	public String oupsHandler() {

		return "notimplemented";
	}
}
