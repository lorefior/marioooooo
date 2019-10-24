package com.curso.escula.logingUsuario.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curso.escula.logingUsuario.MainUs;

@Controller
public class MyController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new MainUs());
        return "greeting";
    }
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute MainUs greeting) {
        return "result";
    }
    @PutMapping("/greeting")
    public String greetingForm1(Model model) {
        return "greeting";
    }
    @DeleteMapping("/greeting")
    public String greetingForm2(Model model) {
        return "greeting";
    }
}