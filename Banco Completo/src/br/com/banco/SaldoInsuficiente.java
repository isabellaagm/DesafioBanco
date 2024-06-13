package br.com.banco;

public class SaldoInsuficiente extends Exception{

	SaldoInsuficiente(String mensagem){
		super(mensagem);
	}
}
