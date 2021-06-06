package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Conta;
import entidades.contaVip;
import entidades.contaPoupanca;

public class Main {

	public static void main(String[] args) {
		int op=0,r=0,op2=0;
		double valorsaque,valordeposito;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		do {
			System.out.println("Bem vindo ao Banco Nota 10");
			System.out.println("Entre com os dados do Cliente");
			System.out.print("Numero da conta: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular da conta: ");
			String titular = sc.nextLine();
			System.out.print("Saldo inicial da conta: ");
			double saldo = sc.nextDouble();
		System.out.printf("\n Digite o tipo da conta que deseja abri para o titular: %s \n ", titular);
		System.out.println("1-Conta Corrente");
		System.out.println("2-Conta Poupança");
		System.out.println("3-Conta Vip");
		System.out.println("0-Sair");
		op = sc.nextInt();
		
		Conta c = new Conta(numero, titular, saldo);
		Cliente cliente1 = new Cliente(c);
		
		switch(op){
		case 1:
			cliente1.criarConta();
			System.out.println(c);
			
			do {
				System.out.println("Deseja Realizar alguma operação? 1 para Sim e 2 para Não");
				 r = sc.nextInt();
				 
				 switch(r) {
				 case 1:
					 	System.out.println("\n1-Sacar");
						System.out.println("\n2-Depositar");
						System.out.println("Opção: ");
						op2=sc.nextInt();
						
						if(op2==1) {
							System.out.println("Digite o valor do saque:");
							valorsaque = sc.nextDouble();
							c.sacar(valorsaque);
						}else {
							System.out.println("Digite o valor do Deposito:");
							valordeposito = sc.nextDouble();
							c.depositar(valordeposito);
						}
					 break;
				 case 2:
	                    System.out.printf("\nSaindo do sistema");
	                    System.exit(1);
	                    break;
	                    
	                default:
	                break;
				 }
			}while(r>0 && r<2);
			 
			break;
		case 2:
			System.out.print("Informe a taxa de juros: ");
			 double taxaDeJuros = sc.nextDouble();
			 Conta cp = new contaPoupanca(numero, titular, saldo, taxaDeJuros);
			 cliente1.criarConta();
			 System.out.println(cp);
			 
			 do {
					System.out.println("Deseja Realizar alguma operação? 1 para Sim e 2 para Não");
					 r = sc.nextInt();
					 
					 switch(r) {
					 case 1:
						 	System.out.println("\n1-Sacar");
							System.out.println("\n2-Depositar");
							System.out.println("Opção: ");
							op2=sc.nextInt();
							
							if(op2==1) {
								System.out.println("Digite o valor do saque:");
								valorsaque = sc.nextDouble();
								c.sacar(valorsaque);
							}else {
								System.out.println("Digite o valor do Deposito:");
								valordeposito = sc.nextDouble();
								c.depositar(valordeposito);
							}
						 break;
					 case 2:
		                    System.out.printf("\nSaindo do sistema");
		                    System.exit(1);
		                    break;
		                    
		                default:
		                break;
					 }
				}while(r>0 && r<2);
				 
				
			break;
		case 3:
			System.out.print("Informe o limite de empréstimo: ");
			double limiteDeEmprestimo = sc.nextDouble();
			Conta cv = new contaVip(numero, titular, saldo, limiteDeEmprestimo);
			cliente1.criarConta();
			System.out.println(cv);
			
			do {
				System.out.println("Deseja Realizar alguma operação? 1 para Sim e 2 para Não");
				 r = sc.nextInt();
				 
				 switch(r) {
				 case 1:
					 	System.out.println("\n1-Sacar");
						System.out.println("\n2-Depositar");
						System.out.println("Opção: ");
						op2=sc.nextInt();
						
						if(op2==1) {
							System.out.println("Digite o valor do saque:");
							valorsaque = sc.nextDouble();
							c.sacar(valorsaque);
						}else {
							System.out.println("Digite o valor do Deposito:");
							valordeposito = sc.nextDouble();
							c.depositar(valordeposito);
						}
					 break;
				 case 2:
	                    System.out.printf("\nSaindo do sistema");
	                    System.exit(1);
	                    break;
	                    
	                default:
	                break;
				 }
			}while(r>0 && r<2);
			
			break;
			
		case 0:
			System.out.println("\nFechando sistema");
            System.exit(1);
            break;
            
        default:
        break;
		}
			
		}while(op>0 && op<4);
	}
}
	
