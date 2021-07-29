package com.algaworks.algafood.infrastructure.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepositoryQuery;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepositoryQuery {

	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Restaurante> find(
			String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal){
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		
		CriteriaQuery<Restaurante> criteria =
				builder.createQuery(Restaurante.class);
		
		Root<Restaurante> root =  criteria.from(Restaurante.class);
		
		var predicates = new ArrayList<Predicate>();
		
		Predicate nomePredicate = builder
				.like(root.get("nome"),"%"+ nome + "%");
		Predicate taxaInicialPredicate = builder
				.greaterThanOrEqualTo(root.get("taxaFrete"),taxaFreteInicial );
		
		Predicate taxaFinalPredicate = builder
				.lessThanOrEqualTo(root.get("taxaFrete"),taxaFreteFinal );
		
		
		if (StringUtils.hasText(nome)) {
			predicates.add(nomePredicate);
		}
		
		if (taxaFreteInicial != null) {
			predicates.add(taxaInicialPredicate);
		}
		
		if (taxaFreteFinal != null) {
			predicates.add(taxaFinalPredicate);
		}				// array com os predicates
		criteria.where(predicates.toArray(new Predicate[0]));
		
		TypedQuery<Restaurante> query = 
				manager.createQuery(criteria);
		
		return query.getResultList();
	
	}
}
