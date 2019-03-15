package com.br.itau.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.br.itau.demo.config.CpfsConfig;

@RestController
public class Piloto {
	
	@Autowired
	CpfsConfig cpfs;
	
	@GetMapping("/v1/{id}")
	public boolean getPiloto(@PathVariable Integer id) {
		long tempoInicio = System.nanoTime();
 
		boolean bool = cpfs
		.getColecao()
		.contains(id);

		System.out.println(System.nanoTime()-tempoInicio);
		
		long tempoInicio2 = System.nanoTime();
		 
		boolean bool2 = cpfs
		.getColecao2()
		.contains(id);

		System.out.println(System.nanoTime()-tempoInicio2);
	
		return bool;
	}

}
