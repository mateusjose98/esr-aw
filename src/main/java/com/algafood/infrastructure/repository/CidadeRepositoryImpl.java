package com.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import com.algafood.domain.model.Cidade;
import com.algafood.domain.repository.CidadeRepository;

@Repository
public class CidadeRepositoryImpl implements CidadeRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cidade> listar() {
		return manager.createQuery("from Cidade", Cidade.class).getResultList();
	}

	@Override
	public Cidade buscar(Long id) {
		return manager.find(Cidade.class, id);
	}

	@Transactional
	@Override
	public Cidade salvar(Cidade cidade) {
		Long id = cidade.getId();
		return manager.merge(buscar(id));
	}

	@Transactional
    @Override
    public void remover(Long id) {
        Cidade cidade = buscar(id);
        
        if (cidade == null) {
            throw new EmptyResultDataAccessException(1);
        }
        
        manager.remove(cidade);
    }





}
