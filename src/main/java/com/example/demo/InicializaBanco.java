package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Pessoa;
import com.example.demo.service.PessoaService;

@Component
public class InicializaBanco implements CommandLineRunner {
	
	@Autowired
	private PessoaService pessoaService;
	
	@Override
	public void run(String... args) throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Spider Man");
		pessoa.setDataNascimento(new Date());
		pessoaService.save(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setNome("Spider Woman");
		pessoa.setDataNascimento(new Date());
		pessoaService.save(pessoa);
		
		List<Pessoa> searchByNameList = pessoaService.findByNomeContaining("Spider");
		for(Pessoa p: searchByNameList) {
			System.out.println(">>> " + p.getNome());
		}
	}

}
