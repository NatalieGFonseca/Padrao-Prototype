package entidades;

public class ContaVip extends Conta implements ServicoConta {
	
	private Double limiteDeEmprestimo;
	
	public ContaVip() {
		super();
	}

	public ContaVip(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void fazerEmprestimo(Double valorAEmprestar) {
		if (valorAEmprestar <= limiteDeEmprestimo) {
			saldo += valorAEmprestar - 10.0;
		}
	}
	
	@Override
	public Conta clonar() {
		return new ContaVip();
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
