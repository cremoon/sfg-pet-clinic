package guru.springframework.controllers;

import guru.springframework.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maikbartels on 2020.07.20
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVest(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
