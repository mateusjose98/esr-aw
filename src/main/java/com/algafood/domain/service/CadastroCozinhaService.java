package com.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algafood.domain.exception.EntidadeEmUsoException;
import com.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algafood.domain.model.Cozinha;
import com.algafood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	public Cozinha salvar(Cozinha cozinha) {

		return cozinhaRepository.salvar(cozinha);

	}

	public void excluir(Long id) {

		try {

			cozinhaRepository.remover(id);

		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("A entidade Cozinha está em uso para esse id=%d.", id));
		} catch(EmptyResultDataAccessException e) {
			throw new 
			EntidadeNaoEncontradaException(
					String.format("Cozinha não encontrada nesse id=%d.", id));
		}
	}

}
