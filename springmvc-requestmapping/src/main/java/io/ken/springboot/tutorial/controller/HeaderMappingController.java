package io.ken.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/header")
@Controller
public class HeaderMappingController {

    @RequestMapping(
            value = "/",
            headers = "type=all"
    )
    @ResponseBody
    public String header() {
        return "header type=all  --ken.io";
    }

    @RequestMapping(
            value = "/",
            consumes = "application/json"
    )
    @ResponseBody
    public String consumes() {
        return "header consumes:application/json  --ken.io";
    }

    @RequestMapping(
            value = "/",
            produces = "application/json"
    )
    @ResponseBody
    public String produces() {
        return "header produces:application/json  --ken.io";
    }
}
