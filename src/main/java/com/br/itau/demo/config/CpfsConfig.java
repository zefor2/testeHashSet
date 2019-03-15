package com.br.itau.demo.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CpfsConfig {
	
	private Collection<Integer> colecao = new HashSet<Integer>();
	
	private Collection<Integer> colecao2 = new ArrayList<Integer>();
    
	@Bean
	public void carregarCpfs(){
		 for (int  i = 0; i < 100; i++) {
		      this.colecao.add(i);
		 }
	}
	
	@Bean
	public void carregarCpfs2(){
		 for (Integer i = 0; i < 100; i++) {
		      this.colecao2.add(i);
		 }
	}

	public Collection<Integer> getColecao2() {
		return colecao2;
	}

	public void setColecao2(Collection<Integer> colecao2) {
		this.colecao2 = colecao2;
	}

	public Collection<Integer> getColecao() {
		return colecao;
	}

	public void setColecao(Collection<Integer> colecao) {
		this.colecao = colecao;
	}
	


}
