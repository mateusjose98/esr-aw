package com.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algafood.AlgafoodApplication;
import com.algafood.domain.model.Cozinha;

public class InclusaoCozinhaMain {
	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class).web(WebApplicationType.NONE).run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha c1 = new Cozinha();
		c1.setNome("Brasileira");
		
		Cozinha c2 = new Cozinha();
		c2.setNome("Japonesa");
		
		cadastroCozinha.adicionar(c1);
		cadastroCozinha.adicionar(c2);
		
		
	
	}

}
