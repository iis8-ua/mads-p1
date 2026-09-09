package demoapp.controller;

import demoapp.service.ParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ParControllerForm {

    @Autowired
    private ParService service;

    @GetMapping("/parform")
    public String parForm(NumeroData numeroData) {
        return "formNumero";
    }

    @PostMapping("/parform")
    public String checkNumero(@ModelAttribute @Valid NumeroData numeroData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formNumero";
        }
        model.addAttribute("mensaje", service.esPar(numeroData.getNumero()));
        return "resultado";
    }
}