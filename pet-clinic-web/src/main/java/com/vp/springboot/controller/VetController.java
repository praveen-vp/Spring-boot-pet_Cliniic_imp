package com.vp.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.springboot.services.VetService;

/**
 *
 * @author praveen-vp
 * 16-Sep-2018
 *
 */

@Controller
public class VetController {

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}
	
    @RequestMapping({"/vets", "/vets/index.html", "/vets/index", "/vets.html" })
    public String listVets(Model model) {
    	
    	model.addAttribute("vets", vetService.findAll());
    	
        return "vets/index.html";
    }

}
