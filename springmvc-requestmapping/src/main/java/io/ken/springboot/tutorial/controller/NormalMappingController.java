package io.ken.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/normal")
@Controller
public class NormalMappingController {

    @RequestMapping
    @ResponseBody
    public String normal() {
        return "normal normal  --ken.io";
    }

    @RequestMapping("/")
    @ResponseBody
    public String normal1() {
        return "normal normal1  --ken.io";
    }

    @RequestMapping(value = {"/a", "/b"})
    @ResponseBody
    public String normal2() {
        return "normal a or b  --ken.io";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "normal index  --ken.io";
    }
}
