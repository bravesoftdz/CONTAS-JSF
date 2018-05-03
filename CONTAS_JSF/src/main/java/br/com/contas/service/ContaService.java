package br.com.contas.service;

import javax.inject.Inject;

import br.com.contas.model.Conta;
import br.com.contas.repository.ContaRepository;
import br.com.contas.util.Transacional;

public class ContaService {

	@Inject
	private ContaRepository repository;
	
	@Transacional
	public void guardar(Conta conta) {
		repository.guardar(conta);
	}
	
	@Transacional
	public void remover(Conta conta) {
		repository.remover(conta);
	}
}
