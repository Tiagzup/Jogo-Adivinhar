package com.br.zup.jogo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.jogo.modells.Jogador;
import com.br.zup.jogo.repositories.JogadorRepository;

@Service
public class JogadorService {
	@Autowired
	private JogadorRepository jogadorRepository;
	
	public void criarJogador (Jogador jogador) {
		jogadorRepository.save(jogador);
	}
	public Iterable<Jogador> showVencedor (){
		return jogadorRepository.findAll();
	}
}
