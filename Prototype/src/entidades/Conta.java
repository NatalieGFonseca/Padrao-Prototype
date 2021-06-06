package entidades;

public class Conta implements ServicoConta{

	protected Integer numero;
	protected String titular;
	protected Double saldo;
	
	public Conta() {}
	
	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	@Override
	public void sacar(Double valorASacar) {
		saldo -= valorASacar;
		System.out.println("Saldo após operação: "+saldo);
	}
	@Override
	public void depositar(Double valorADepositar) {
		saldo += valorADepositar;
		System.out.println("Saldo após operação: "+saldo);
	}
	@Override
	public Conta clonar() {
		return new Conta(numero, titular, saldo);
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
}
