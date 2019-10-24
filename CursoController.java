package com.curso.escula.logingUsuario.MyController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curso.escula.logingUsuario.Curso;

public class CursoController {

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Curso());
		return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Curso greeting) {
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
