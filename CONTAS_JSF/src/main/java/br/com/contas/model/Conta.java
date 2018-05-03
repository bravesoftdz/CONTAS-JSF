package br.com.contas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Conta {

	@Id 
	@GeneratedValue
	private Long codigo;
	
	@Column(name = "descricao_conta", nullable = false, length = 200)
	private String descricao;
	
	@Column(name = "valor_conta", nullable = false, length = 100)
	private String valor;
	
	@Column(name = "numero_de_parcelas", nullable = false, length = 5)
	private String parcela;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_da_conta")
	private Date data;
	
	public Conta() {}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getParcela() {
		return parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
