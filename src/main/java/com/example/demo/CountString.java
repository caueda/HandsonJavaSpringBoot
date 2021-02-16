package com.example.demo;

import java.util.Collection;

public class CountString {
	public Integer count(String toSearch, Collection<String> stringList) {
		Integer qtde = 0;
		for(String currentString: stringList) {
			if(currentString.equals(toSearch)) {
				qtde++;
			}
		}
		
		return qtde;
	}
}
