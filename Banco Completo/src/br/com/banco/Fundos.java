package br.com.banco;

public class Fundos implements Produto{

	@Override
	public double investir(double valor) {
		return valor*0.015;
	}
}