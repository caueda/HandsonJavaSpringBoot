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
		pessoa.setIdade(18);
		pessoaService.save(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setNome("Spider Woman");
		pessoa.setDataNascimento(new Date());
		pessoa.setIdade(17);
		pessoaService.save(pessoa);
		
		List<Pessoa> searchByNameList = pessoaService.findByIdadeGreaterThan(10);
		for(Pessoa p: searchByNameList) {
			System.out.println(">>> " + p.getNome());
			if(p.getNome().equals("Spider Woman")) {
				p.setNome("Spider Woman 1");
				pessoaService.save(pessoa);
			}
		}
	}

}
