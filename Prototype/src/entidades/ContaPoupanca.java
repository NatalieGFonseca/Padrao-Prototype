package entidades;

public class ContaPoupanca extends Conta implements ServicoConta {
	
private Double taxaDeJuro;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuro) {
		super(numero, titular, saldo);
		this.taxaDeJuro = taxaDeJuro;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuro;
	}
	
	@Override
	public Conta clonar() {
		return new ContaPoupanca();
	}
	
	public Double getTaxaDeJuro() {
		return taxaDeJuro;
	}
	
	public void setTaxaDeJuro(Double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [taxaDeJuro=" + taxaDeJuro + "]";
	}

}
