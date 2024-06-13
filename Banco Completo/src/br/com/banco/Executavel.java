package br.com.banco;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Executavel {

	public static void main(String[] args) throws ParseException, SaldoInsuficiente {

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyyMMdd");
		CDB cdb = new CDB();

		Date dataMaria = dataFormatada.parse("19870102");
		Date dataJoao = dataFormatada.parse("20000507");

		Cliente maria = new Cliente("Maria Eduarda", "44555511100", "(11)999998888", dataMaria);
		ContaCorrente contaMaria = new ContaCorrente(maria);

		Cliente joao = new Cliente("João Pedro", "88996754360", "(11)997980548", dataJoao);
		ContaCorrente contaJoao = new ContaCorrente(joao);

		contaMaria.depositar(1000);
		// contaMaria.exibirSaldo();
		// contaJoao.exibirSaldo();

		// contaMaria.transferir(500, contaJoao);
		// contaJoao.exibirSaldo();
		// contaMaria.exibirSaldo();

		// contaJoao.sacar(450.87);
		// contaJoao.exibirSaldo();

		contaMaria.aplicacao(100, cdb);
		contaMaria.exibirExtratoInv();

	}

}
