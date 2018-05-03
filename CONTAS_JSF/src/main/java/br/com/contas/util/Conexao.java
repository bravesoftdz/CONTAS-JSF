package br.com.contas.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class Conexao {
	
	@Inject
	private EntityManagerFactory emf;
	
	public Conexao() {
		this.emf = Persistence.createEntityManagerFactory("CONTAS_JSF");
	}
	
	@Produces
	@RequestScoped
	public EntityManager criarConexao() {
		return this.emf.createEntityManager();
	}

	public void fecharConexao(@Disposes EntityManager em) {
		em.close();
	}
	
}
