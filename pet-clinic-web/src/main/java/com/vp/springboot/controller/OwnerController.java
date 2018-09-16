package com.vp.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owmers")
@Controller
public class OwnerController {

    @RequestMapping({"", "/index.html", "/index"})
    public String listOwners() {
        return "owners/index.html";
    }
}