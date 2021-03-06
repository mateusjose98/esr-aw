package com.algaworks.algafood.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.algaworks.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
	
//	@Query("from Restaurante where nome like %:nome% and cozinha.id = :id")
	List<Restaurante> consultarPorNome(String nome, @Param("id") Long cozinha);
	
	List<Restaurante> findByTaxaFreteBetween(BigDecimal v_inicial, BigDecimal v_final);
	
	List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinha);
	
	// Optional<Restaurante> findTop1ByNomeContaining(String nome); faria a mesma coisa
	Optional<Restaurante> findFirstByNomeContaining(String nome);
	
	
	int countByCozinhaId(Long id);
}
