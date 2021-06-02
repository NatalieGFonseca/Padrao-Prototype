package entidades;

public class Cliente {
	
	private Conta conta;
	
	public Cliente(Conta conta) {
		this.conta = conta.clonar();
	}

	public void criarConta(Conta c) {
		c.clonar();
	}
}

