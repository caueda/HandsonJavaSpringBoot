package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CountNumeroTest {
	CountNumero countNumero = new CountNumero();
	
	@Test
	void testCount() {
		List<Numero> lista = new ArrayList<>();
		
		lista.add(new Numero(1,2));
		lista.add(new Numero(2,0));
		lista.add(new Numero(3,0));
		lista.add(new Numero(1,2));
		
		assertEquals(Integer.valueOf(2), countNumero.count(new Numero(1,2), lista));
	}

}
