package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Pessoa;

public interface PessoaService {
	public void save(Pessoa pessoa);
	public Optional<Pessoa> findById(Long id);
	public List<Pessoa> findByNomeContaining(String nome);
}
