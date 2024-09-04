package espr;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro("Honda", "Civic", 2020, 0);
		
		carro.imprimir();
		carro.fazerPercurso(30);
		carro.imprimir();
		
	}
	
}
