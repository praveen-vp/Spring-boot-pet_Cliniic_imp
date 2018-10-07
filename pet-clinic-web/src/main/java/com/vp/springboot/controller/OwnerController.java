package com.vp.springboot.controller;

import com.vp.springboot.services.map.OwnerServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")
@Controller
public class OwnerController {

    private final OwnerServiceMap ownerServices;

    public OwnerController(OwnerServiceMap ownerServices) {
        this.ownerServices = ownerServices;
    }

    @RequestMapping({"", "/index.html", "/index"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerServices.findAll());

        return "owners/index.html";
    }
    
    @RequestMapping("/find")
    public String find() {
    	
    	return "notimplemented";
    }
}