package entidades;

import java.util.Random;
import java.util.Scanner;

public class Cliente implements Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public Cliente()
	{
		
	}
	
	Scanner entrada = new Scanner(System.in);
	public void criarConta() {
		
		
		
		this.numero = numeroConta();
		System.out.print("Conta numero:"+numero);
		System.out.println("Insira o nome do titular: ");
	    this.setTitular(entrada.toString());
	    System.out.println("Insira o saldo inicial");
	    this.setSaldo(entrada.nextDouble());
	    
	    
		
	}
	
	public int numeroConta()
	{
		Random rand = new Random();
		int num = 0;
		num = rand.nextInt();
		return num;
	}
	
     public Conta clone() {
    	 return new Cliente();
     }

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public void sacar(double valorAsacar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valorAdepositar) {
		// TODO Auto-generated method stub
		
	}
}

