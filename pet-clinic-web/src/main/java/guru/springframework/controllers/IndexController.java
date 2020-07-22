package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maikbartels on 2020.07.20
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public  String oups() {
        return "notimplemented";
    }
}
