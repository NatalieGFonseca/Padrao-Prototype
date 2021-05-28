package entidades;

import java.util.Scanner;

public class contaVip implements Conta{
	double limite = 5000;
	double saque, deposito, emprestimo, saldo;
	
	public contaVip() {
		
	}
	
	public contaVip(contaVip contaVip) {
		int op= 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Bem-vindo, Cliente VIP");
			System.out.println("\n1 - Saque");
			System.out.println("\n2 - Depósito");
			System.out.println("\n3 - Empréstimo");
			System.out.println("\n4- Sair");
			System.out.println("Opção desejada: ");
			op = entrada.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Valor de saque: ");
				saque = entrada.nextDouble();
				contaVip.sacar(saque);
				break;
			case 2:
				System.out.println("Valor do depósito: ");
				deposito = entrada.nextDouble();
				contaVip.depositar(deposito);
				break;
			case 3:
				System.out.println("Valor do empréstimo: ");
				emprestimo = entrada.nextDouble();
				contaVip.fazerEmprestimo(emprestimo);
				break;
			case 4:
				System.out.printf("\nFechando sistema");
                System.exit(1);
                break;
                
                default:
                	break;
                
			}
		}while(op>0 && op<4);
	}
	
	@Override
	public void sacar(double valorAsacar) {
		if(valorAsacar > (saldo+limite)) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo -= valorAsacar;
			System.out.println("Saldo após a operação: "+saldo);
		}
	}

	@Override
	public void depositar(double valorAdepositar) {
		saldo += valorAdepositar;
	}
	
	public void fazerEmprestimo(double valorAemprestar) {
		if(valorAemprestar <= limite) {
			emprestimo = valorAemprestar;
			limite -= valorAemprestar;
			System.out.println("Limite de empréstimo disponível após operação: "+limite);
		}else {
			if(valorAemprestar > limite) {
				System.out.println("Limite excedido");
			}else {
				System.out.println("O limite já foi utilizado");
			}
		}
	}

	@Override
	public Conta clone() {
		return new contaVip(this);
	}

}

