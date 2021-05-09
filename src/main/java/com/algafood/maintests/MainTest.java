package com.algafood.maintests;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algafood.AlgafoodApplication;
import com.algafood.domain.model.FormaPagamento;
import com.algafood.domain.repository.FormaPagamentoRepository;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class).web(WebApplicationType.NONE).run(args);
		
		FormaPagamentoRepository fp = applicationContext.getBean(FormaPagamentoRepository.class);
	
		List<FormaPagamento> r = fp.listar();
		
		r.forEach(System.out::println);
		
	}

}
