package br.com.banco;

import java.util.Date;

public class ClientePF extends Cliente {
	private int cpf;

	public ClientePF(String nome, String cpf, String telefone, Date dataNascimento) {
		super(nome, cpf, telefone, dataNascimento);
	}

}