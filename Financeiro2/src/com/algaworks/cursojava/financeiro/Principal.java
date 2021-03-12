package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");
		
		Cliente atacadista = new Cliente();
		atacadista.setNome("Tri�ngulo Quadrado");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunica��es");
		
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 390d, "19/05/2012");
		
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de Projeto de logistica em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online", 53200d, "13/05/2012");
		
		contaPagar1.pagar();
		contaPagar2.cancelar();
		
		contaReceber1.receber();
		contaReceber2.cancelar();
		

	}

}
