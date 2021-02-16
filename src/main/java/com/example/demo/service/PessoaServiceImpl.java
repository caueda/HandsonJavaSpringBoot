package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Pessoa;
import com.example.demo.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

	private PessoaRepository pessoaRepository;
	
	public PessoaServiceImpl(PessoaRepository pessoaRepository) {
		super();
		this.pessoaRepository = pessoaRepository;
	}

	@Override
	public void save(Pessoa pessoa) {
		this.pessoaRepository.save(pessoa);
	}

	@Override
	public Optional<Pessoa> findById(Long id) {
		Optional<Pessoa> findById = this.pessoaRepository.findById(id);
		return findById;
	}

	@Override
	public List<Pessoa> findByNomeContaining(String nome) {
		List<Pessoa> findByNome = this.pessoaRepository.findByNomeContaining(nome);
		return findByNome;
	}

}
