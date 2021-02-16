package com.example.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(callSuper = false, of = {"inteiro", "decimal"})
public class Numero {
	
	private int inteiro;
	private int decimal;
	
	public Numero(int inteiro, int decimal) {
		super();
		this.inteiro = inteiro;
		this.decimal = decimal;
	}
}