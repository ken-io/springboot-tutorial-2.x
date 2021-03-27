package io.ken.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/path")
@Controller
public class PathParamsMappingController {

    @RequestMapping("/welcome/{name}")
    @ResponseBody
    public String welcome(@PathVariable(name = "name") String name) {
        return String.format("path welcome:%s  --ken.io", name);
    }

    @RequestMapping("/num/{min}/{max}")
    @ResponseBody
    public String num(@PathVariable(name = "min") Integer min,
                      @PathVariable(name = "max") Integer max) {
        return String.format("path min:%s,max:%s  --ken.io", min, max);
    }
}
