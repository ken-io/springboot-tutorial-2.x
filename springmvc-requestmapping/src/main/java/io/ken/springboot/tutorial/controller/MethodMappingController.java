package io.ken.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/method")
@Controller
public class MethodMappingController {

    @PostMapping("/")
    @ResponseBody
    public String post() {
        return "method post  --ken.io";
    }

    @GetMapping("/")
    @ResponseBody
    public String get() {
        return "method get  --ken.io";
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    public String put() {
        return "method put  --ken.io";
    }

    @RequestMapping(value = "/", method = {RequestMethod.TRACE, RequestMethod.DELETE})
    @ResponseBody
    public String other(HttpServletRequest request) {
        return "method " + request.getMethod() + "  --ken.io";
    }
}
