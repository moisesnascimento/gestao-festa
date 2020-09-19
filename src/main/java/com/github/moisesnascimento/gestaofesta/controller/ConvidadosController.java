package com.github.moisesnascimento.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.moisesnascimento.gestaofesta.model.Convidado;
import com.github.moisesnascimento.gestaofesta.service.ConvidadoService;

@RestController
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	ConvidadoService convidadoService;

	@GetMapping()
	public ModelAndView listarConvidados() {
		ModelAndView modelandview = new ModelAndView("ListaConvidados");
		modelandview.addObject("convidados", convidadoService.findAll());
		modelandview.addObject("convidado", new Convidado());
		return modelandview;
	}
	
	@PostMapping
	public String inserirConvidado(Convidado convidado) {
		convidadoService.adicionarConvidado(convidado);
		return "redirect:/Teste";
	}
}
