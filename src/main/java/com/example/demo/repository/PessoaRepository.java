package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	public List<Pessoa> findByNomeContaining(String nome);
	List<Pessoa> findByIdadeGreaterThan(Integer idade);
}
