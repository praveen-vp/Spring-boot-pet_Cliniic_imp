package com.vp.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author praveen-vp
 * 16-Sep-2018
 *
 */

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index " })
    public String listVets() {
        return "vets/index.html";
    }

}
