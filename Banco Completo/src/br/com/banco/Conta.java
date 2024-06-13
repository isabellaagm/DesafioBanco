package br.com.banco;

import java.awt.HeadlessException;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Conta { //abstrat proíbe que seja feita instância

	// atributos
	protected Cliente cliente; //composição
	protected int numeroConta;
	protected double saldo; // inicia com 0.0
	protected Date dataAbertura = new Date(); // pega a data atual do sistema
	Random random = new Random();
	static long contador; //static cria uma variável para a classe e não para os objetos da classe

	// construtor
	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.numeroConta = random.nextInt(9999);
		this.dataAbertura = new Date();
		contador++;
	}

	// métodos
	// sacar
	public boolean sacar(double valor) throws SaldoInsuficiente {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			throw new SaldoInsuficiente("Não há saldo suficiente para essa operação");
		}
		

	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// transferir
	public void transferir(double valor, Conta contaQueRecebe) throws SaldoInsuficiente {
		if (this.sacar(valor)) {
			contaQueRecebe.saldo += valor;
		} else {
			throw new SaldoInsuficiente("Não há saldo suficiente para essa operação");
		}
	}

	// exibirSaldo
	public abstract void exibirSaldo();
	
	public static void exibirContador() {
		System.out.println("Contas criadas: "+contador);
	}

}
