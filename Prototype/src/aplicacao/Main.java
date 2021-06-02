package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Conta;
import entidades.ContaVip;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Entre com os dados da Conta: ");
		System.out.print("Numero da conta: ");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular da conta: ");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial da conta: ");
		Double saldo = sc.nextDouble();

		Conta c = new Conta(numero, titular, saldo);

		Cliente cliente1 = new Cliente(c);

		System.out.println(c);

		// System.out.print("Informe a taxa de juros: ");
		// Double taxaDeJuros = sc.nextDouble();

		// Conta cp = new ContaPoupanca(numero, titular, saldo, taxaDeJuros);

		// Cliente cliente2 = new Cliente(cp);
		// cliente1.criarConta(cp);

		// System.out.println(cp);

		System.out.print("Informe o limite de empréstimo: ");
		Double limiteDeEmprestimo = sc.nextDouble();

		Conta cv = new ContaVip(numero, titular, saldo, limiteDeEmprestimo);
		cliente1.criarConta(cv);

		cv.sacar(400.0);
		System.out.println(cv.getSaldo());

		System.out.println(cv);

		sc.close();
	}
}
