package entidades;

public interface Conta {
	public void sacar(double valorAsacar);
	public void depositar(double valorAdepositar);
	public abstract Conta clone();
}
