package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(callSuper = true, of={"dataNascimento"})
@Getter @Setter
public class Pessoa extends BaseEntity {
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private Integer idade;
}
