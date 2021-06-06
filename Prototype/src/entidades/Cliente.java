package entidades;

public class Cliente {
private Conta contaC = new Conta();
	
	public Cliente(Conta conta) {
		conta = new Conta();
		this.contaC.saldo = conta.getSaldo();
		this.contaC.titular = conta.getTitular();
		this.contaC.numero = conta.getNumero();
	}

	public Conta criarConta() {
		return this.contaC.clonar();
	}
}
