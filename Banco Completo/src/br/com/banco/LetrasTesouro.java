package br.com.banco;

public class LetrasTesouro implements Produto{

	@Override
	public double investir(double valor) {
		return valor*1.01;
	}
}