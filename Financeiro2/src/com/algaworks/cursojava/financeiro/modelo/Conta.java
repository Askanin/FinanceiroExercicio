package com.algaworks.cursojava.financeiro.modelo;

public class Conta {

	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao =  descricao;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDataVencimento() {
		return this.dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
	
	public void cancelar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("A conta " + this.getDescricao() + "não pode ser cancelada, pois ela já foi paga.");
		} else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("A conta " + this.getDescricao() + "já foi cancelada.");
		} else {
			System.out.println("A conta " + this.getDescricao() + " de valor " + this.getValor() + " e vencimento " + this.getDataVencimento() + " foi CANCELADA.");
			
			this.situacaoConta = situacaoConta.CANCELADA;
		}
	}
}
