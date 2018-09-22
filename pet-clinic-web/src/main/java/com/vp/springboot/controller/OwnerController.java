package com.vp.springboot.controller;

import com.vp.springboot.services.OwnerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owmers")
@Controller
public class OwnerController {

    private final OwnerServices ownerServices;

    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }

    @RequestMapping({"", "/index.html", "/index"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerServices.findAll());

        return "owners/index.html";
    }
}