package br.com.banco;

import java.util.Date;

public class ClientePJ extends Cliente {
	private long cnpj;

	public ClientePJ(String nome, String cpf, String telefone, Date dataNascimento, long cnpj) {
		super(nome, cpf, telefone, dataNascimento);
		this.cnpj = cnpj;
	}

}
