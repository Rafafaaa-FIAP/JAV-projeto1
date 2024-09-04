package espr;

public class ContaBancaria {

	private double saldo;
	private double valor;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(double saldo, double valor) {
		super();
		this.saldo = saldo;
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void imprimirSaldo() {
		String texto = "O saldo da sua conta é " + saldo;
		System.out.println(texto);
	}
	
	public void imprimirSaldo(String moeda) {
		if (moeda == null) {
			moeda = "BRL";
		}
		else {
			saldo /= 5.63;
		}
		String texto = "O saldo da sua conta em " + moeda + " é " + saldo;
		System.out.println(texto);
	}
	
}
