package com.br.zup.jogo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.zup.jogo.modells.Jogador;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Integer> {

}
