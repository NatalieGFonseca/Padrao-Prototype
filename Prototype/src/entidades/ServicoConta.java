package entidades;

public interface ServicoConta {
	
	public abstract void sacar(Double valorASacar);
	public abstract void depositar(Double valorADepositar);
	public abstract ServicoConta clonar();
}
