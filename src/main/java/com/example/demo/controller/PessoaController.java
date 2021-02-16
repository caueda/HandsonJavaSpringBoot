package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Pessoa;
import com.example.demo.service.PessoaService;

@RestController
public class PessoaController {
	private PessoaService pessoaService;
	
	public PessoaController(PessoaService pessoaService) {
		super();
		this.pessoaService = pessoaService;
	}

	@GetMapping("/pessoa")
	public List<Pessoa> listAllPessoa() {
		return pessoaService.findByNomeContaining("Spider Man");
	}
}
