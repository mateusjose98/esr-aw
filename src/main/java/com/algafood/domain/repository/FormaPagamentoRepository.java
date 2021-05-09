package com.algafood.domain.repository;

import java.util.List;

import com.algafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {
	
	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento salvar(FormaPagamento cozinha);
	void remover(FormaPagamento cozinha);

}
