package espr;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	private float km;
	
	// Métodos construtores
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public Carro(String marca, String modelo, int ano, float km) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public float getKm() {
		return km;
	}

	public void fazerPercurso(float km) {
		this.km += km;
	}
	
	public void imprimir() {
		String texto = "O carro da marca " + marca + " modelo " + modelo + " ano " + ano + " km " + km;
		System.out.println(texto);
	}
	
	public void imprimir(boolean imprimirMaiuscula) {
		String texto = "O carro da marca " + marca + " modelo " + modelo + " ano " + ano + " km " + km;
		if (imprimirMaiuscula) {
			System.out.println(texto.toUpperCase());
		}
		else {
			System.out.println(texto);
		}
	}
	
	public void imprimir(String marca) {
		String texto = "A marca do carro é " + marca;
		System.out.println(texto);
	}
	
}
