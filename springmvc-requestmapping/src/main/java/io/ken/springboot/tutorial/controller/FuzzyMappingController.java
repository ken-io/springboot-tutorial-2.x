package io.ken.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/fuzzy")
@Controller
public class FuzzyMappingController {

    @RequestMapping("/single?")
    @ResponseBody
    public String single(HttpServletRequest request) {
        return "fuzzy single " + request.getRequestURI() + "  --ken.io";
    }

    @RequestMapping("/multi*")
    @ResponseBody
    public String multi(HttpServletRequest request) {
        return "fuzzy multi " + request.getRequestURI() + "  --ken.io";
    }

    @RequestMapping("/regex/{name:[A-z]+}")
    @ResponseBody
    public String regex(@PathVariable String name, HttpServletRequest request) {
        return "fuzzy regex " + name + " , " + request.getRequestURI() + "  --ken.io";
    }

}
