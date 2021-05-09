package com.algafood.domain.repository;

import java.util.List;

import com.algafood.domain.model.FormaPagamento;
import com.algafood.domain.model.Permissao;

public interface PermissaoRepository {
	
	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao cozinha);
	void remover(Permissao cozinha);

}