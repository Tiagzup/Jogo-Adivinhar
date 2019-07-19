package com.br.zup.jogo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.jogo.modells.Sorteio;

@Repository
public interface SorteioRepository extends CrudRepository<Sorteio, Integer>{

}
