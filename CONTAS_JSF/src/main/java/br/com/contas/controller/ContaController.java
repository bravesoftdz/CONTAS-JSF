package br.com.contas.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.contas.model.Conta;
import br.com.contas.repository.ContaRepository;
import br.com.contas.service.ContaService;

@Named
@ViewScoped
@ManagedBean
public class ContaController {

	@Inject
	private ContaRepository repository;
	
	@Inject
	private ContaService service;
	
	private List<Conta> contas;
	private Conta contaNova = new Conta();
	
	public void listarContas() {
		contas = repository.listar();
	}
	
	public void addConta() {
		contaNova = new Conta();
	}
	
	public void guardarConta() {
		service.guardar(contaNova);
		listarContas();
	}
	
	public void removerConta() {
		service.remover(contaNova);
		listarContas();
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public Conta getContaNova() {
		return contaNova;
	}

	public void setContaNova(Conta contaNova) {
		this.contaNova = contaNova;
	}
}
