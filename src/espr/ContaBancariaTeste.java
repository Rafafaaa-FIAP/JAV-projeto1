package espr;

public class ContaBancariaTeste {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria(500, 100);
		conta.imprimirSaldo();
		conta.sacar(200);
		conta.imprimirSaldo();
		conta.depositar(50);
		conta.imprimirSaldo();

	}

}
