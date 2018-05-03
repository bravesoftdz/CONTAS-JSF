package br.com.contas.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.contas.model.Conta;

public class ContaRepository {
	
	@Inject
	private EntityManager em;
	
	public Conta buscaCodigo(Long codigo) {
		return em.find(Conta.class, codigo);
	}
	
	public List<Conta> listar(){
		return em.createQuery("FROM Conta", Conta.class).getResultList();
	}

	public Conta guardar(Conta conta) {
		return em.merge(conta);
	}
	
	public void remover(Conta conta) {
		conta = buscaCodigo(conta.getCodigo());
		em.remove(conta);
	}
}
