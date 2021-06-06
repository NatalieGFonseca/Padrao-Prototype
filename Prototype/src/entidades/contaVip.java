package entidades;

public class contaVip extends Conta implements ServicoConta {
	
	private Double limiteDeEmprestimo;
	
	public contaVip() {
		super();
	}

	public contaVip(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void fazerEmprestimo(Double valorAEmprestar) {
		if (valorAEmprestar <= limiteDeEmprestimo) {
			saldo += valorAEmprestar - 10.0;
			System.out.println("Saldo após operação: "+saldo);
		}
	}
	
	@Override
	public Conta clonar() {
		return new contaVip();
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	@Override
	public String toString() {
		return "ContaVip [limiteDeEmprestimo=" + limiteDeEmprestimo + "]";
	}
}
