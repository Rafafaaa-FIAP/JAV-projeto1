package espr;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.somar(10, 10);
		System.out.println("O resultado da soma é: " + resultado);

		resultado = calculadora.subtrair(20, 10);
		System.out.println("O resultado da subtração é: " + resultado);

		resultado = calculadora.multiplicar(20, 3);
		System.out.println("O resultado da multiplicação é: " + resultado);

		float resultado2 = calculadora.dividir(10, 20);
		System.out.println("O resultado da divisão é: " + resultado2);

		calculadora.verificarImparPar(1);
		calculadora.verificarImparPar(2);
	}

}
