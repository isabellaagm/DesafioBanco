package br.com.banco;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{

	private double saldoInvestimento; 
	private double saldoCredito;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void aplicacao(double valor, Produto produto) throws SaldoInsuficiente {
		if(this.sacar(valor)) {
			saldoInvestimento+= produto.investir(valor);
		}
	}
	
	public void resgate() {
		this.saldo += saldoInvestimento;
		saldoInvestimento = 0;
	}
	
	public void credito(double valor) {
		if(saldoCredito<10000 && valor<=10000) {
			saldoCredito+=valor;
		}
	}
	
	public void exibirExtratoInv() {
		JOptionPane.showMessageDialog(null, "-Extrato de Investimento - \n Cliente: "+this.cliente.getNome()+"\n Data de nascimento: "+this.cliente.getDataNascimento()+"\n Cliente desde: "+this.dataAbertura+"\n Saldo: "+this.saldo+"\n Saldo investimento: "+this.saldoInvestimento+"\n Saldo Total: "+(this.saldoInvestimento+this.saldo));
	}

	@Override
	public void exibirSaldo() {
		JOptionPane.showMessageDialog(null,
				"Cliente: " + this.cliente.getNome() + "\n Data de nascimento: " + this.cliente.getDataNascimento()
						+ "\n Cliente desde: " + this.dataAbertura + "\n Saldo: " + this.saldo);
		
	}
	
	

}
