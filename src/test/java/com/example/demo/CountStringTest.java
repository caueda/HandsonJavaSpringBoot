package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CountStringTest {

	CountString countString = new CountString();
	
	@Test
	void testCount() {
		List<String> lista = new ArrayList<>();
		
		lista.add(new String("teste"));
		lista.add("abacaxi");
		lista.add("maçã");
		lista.add("teste");
		lista.add("feijão");
		
		assertEquals(Integer.valueOf(2), countString.count("teste", lista));
	}

	@Test
	void testCountInSet() {
		Set<String> lista = new HashSet<>();
		
		lista.add("teste");
		lista.add("abacaxi");
		lista.add("maçã");
		lista.add("teste");
		lista.add("feijão");
		
		assertEquals(Integer.valueOf(1), countString.count("teste", lista));
	}
}
