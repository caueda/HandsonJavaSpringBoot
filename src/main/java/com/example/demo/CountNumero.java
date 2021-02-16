package com.example.demo;

import java.util.Collection;

public class CountNumero {
	public Integer count(Numero toSearch, Collection<Numero> numeroList) {
		Integer qtde = 0;
		for(Numero currentNumero: numeroList) {
			if(currentNumero.equals(toSearch)) {
				qtde++;
			}
		}
		
		return qtde;
	}
}
