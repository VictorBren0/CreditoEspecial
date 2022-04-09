package entidade;

public class Conta {
	
	private double saldo;
	private String usuario;
	private int numero;
	private double credito;
	
	
	public Conta(String usuario, int numero, double saldo, double credito) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		this.credito = credito;
	}
	
	public void Saque(double valorSaque) {
		if (saldo < valorSaque) {
			double resto = 0;
			resto = saldo -= valorSaque;
			credito += resto;
			saldo = 0;
		}
		else {
			saldo -= valorSaque;
		}
	}		
	public void Deposito(double valorDeposito) {
		if (credito < 100) {
			double resto = 0;
			resto = 100 - credito;
			if (valorDeposito > resto) {
				double addSaldo = valorDeposito - resto;
				credito = 100;
				saldo = saldo + addSaldo;
			}
			else {
				credito += valorDeposito;
			}	
		}
		else {
			saldo += valorDeposito;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNumero() {
		return numero;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
}

