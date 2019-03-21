package com.br.itau.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.br.itau.demo.config.CpfsConfig;

import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

@RestController
public class Piloto {
	
	@Autowired
	CpfsConfig cpfs;
	
	
	
	@GetMapping("/v1/{id}")
	public Mono<Boolean> getPiloto(@PathVariable Integer id) {
		
 
		
		Mono<Boolean> mono =  new Mono<Boolean>() {
			
			@Override
			public void subscribe(CoreSubscriber<? super Boolean> arg0) {
				long tempoInicio = System.nanoTime();
				boolean bool = cpfs
						.getColecao()
						.contains(id);
				System.out.println(System.nanoTime()-tempoInicio);
				
				long tempoInicio2 = System.nanoTime();
				 
				
				Boolean b = new Boolean(bool);
				boolean bool2 = cpfs
						.getColecao2()
						.contains(id);

						System.out.println(System.nanoTime()-tempoInicio2);
				
			}
		};
		
		return mono.doOnNext(Consumer<Boolean> -> Boolean b = true );
	}

}
