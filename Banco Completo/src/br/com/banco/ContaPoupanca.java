package br.com.banco;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
	
	private double saldoInvestimento; 

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void aplicacao(double valor) {
		saldoInvestimento = valor*1.1;
	}
	
	public void resgate() {
		this.saldo+=saldoInvestimento;
	}

	@Override
	public void exibirSaldo() {
		JOptionPane.showMessageDialog(null,
				"Cliente: " + this.cliente.getNome() + "\n Data de nascimento: " + this.cliente.getDataNascimento()
						+ "\n Cliente desde: " + this.dataAbertura + "\n Saldo: " + this.saldo);
		
	}
}