package espr;

public class Calculadora {

	// Operadores Aritméticos e Operadores de Atribuição
	public int somar(int valor1, int valor2) {
		int retorno = valor1 + valor2;
		return retorno;
	}
	
	public int somar(int valor1, int valor2, int valor3) {
		int retorno = valor1 + valor2;
		retorno += valor3;
		return retorno;
	}

	public int subtrair(int valor1, int valor2) {
		int retorno = valor1 - valor2;
		return retorno;
	}

	public int subtrair(int valor1, int valor2, int valor3) {
		int retorno = valor1 - valor2;
		retorno -= valor3;
		return retorno;
	}

	public int multiplicar(int valor1, int valor2) {
		int retorno = valor1 * valor2;
		return retorno;
	}

	public int multiplicar(int valor1, int valor2, int valor3) {
		int retorno = valor1 * valor2;
		retorno *= valor3;
		return retorno;
	}

	public float dividir(float valor1, float valor2) {
		float retorno = valor1 / valor2;
		return retorno;
	}

	public float dividir(float valor1, float valor2, float valor3) {
		float retorno = valor1 / valor2;
		retorno /= valor3;
		return retorno;
	}
	
	public int varificarModulo(int valor1, int valor2) {
		return valor1 %= valor2;
	}

	public void verificarImparPar(int valor) {
		if (valor % 2 == 0) {
			System.out.println("Número é par");
		}
		else {
			System.out.println("Número é ímpar");
		}
	}
}
