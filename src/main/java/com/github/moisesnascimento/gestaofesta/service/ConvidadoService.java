package com.github.moisesnascimento.gestaofesta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.moisesnascimento.gestaofesta.model.Convidado;
import com.github.moisesnascimento.gestaofesta.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	ConvidadoRepository convidadoRepository;

	public void adicionarConvidado(Convidado convidado) {
		convidadoRepository.save(convidado);
	}

	public Iterable<Convidado> findAll() {
		return convidadoRepository.findAll();
	}
}
