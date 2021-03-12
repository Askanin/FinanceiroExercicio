package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta{
	
	Cliente cliente;
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void receber() {
		System.out.println("------------------------");
		System.out.println("Conta: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de Vencimento: " + this.getDataVencimento());
		System.out.println("Fornecedor: " + this.getCliente().getNome());
		System.out.println("Status: RECEBIDA");
		System.out.println("------------------------");
	}
	
	public void cancelar() {
		if(valor >= 50000) {
			System.out.println("A conta não pode ser cancelada.");
		} else {
			System.out.println("A conta foi cancelada com sucesso.");
		}
	}

}
