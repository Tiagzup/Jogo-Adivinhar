package com.br.zup.jogo.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zup.jogo.modells.Jogador;
import com.br.zup.jogo.modells.Sorteio;
import com.br.zup.jogo.repositories.JogadorRepository;
import com.br.zup.jogo.repositories.SorteioRepository;

@Service
public class SorteioService {
	@Autowired
	private JogadorRepository jogadorRepository;
	@Autowired
	private SorteioRepository sorteioRepository;
	
	public String numeroSorteado(Jogador jogador) {
		Random random = new Random();
		Sorteio jogar = new Sorteio();
		int Numero = 1+random.nextInt(10);
		String mensagem = "";
		
		if()
	}
}
