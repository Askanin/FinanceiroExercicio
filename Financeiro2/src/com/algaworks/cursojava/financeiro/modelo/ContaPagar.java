package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta{

	Fornecedor fornecedor;
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public ContaPagar() {
		
	}
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
		
	}
	
	public void pagar() {
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("A conta " + this.getDescricao() + " já foi paga.");
		} else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("A conta " + this.getDescricao() + " já foi cancelada.");
		}else {
			System.out.println("------------------------");
			System.out.println("Conta: " + this.getDescricao());
			System.out.println("Valor: " + this.getValor());
			System.out.println("Data de Vencimento: " + this.getDataVencimento());
			System.out.println("Fornecedor: " + this.getFornecedor().getNome());
			System.out.println("Status: PAGA");
			System.out.println("------------------------");
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
}
