package espr;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando por aqui...");
		
		Aluno aluno = new Aluno();
		aluno.nome = "Rafael";
		aluno.tamanho = 1.73f;
		aluno.cor = "branco";
		aluno.documento = "999999";
		aluno.estudar();
		aluno.jogar();
		aluno.conversar();
		
		Aluno joao = new Aluno();
		joao.nome = "Joao Pedro";
		joao.tamanho = 1.79f;
		joao.cor = "branco";
		joao.documento = "999999";
		joao.estudar();
		joao.jogar();
		joao.conversar();
		Mesa mesa = joao.constroirMesa();
		mesa.cor = "Branca";
		
		
		System.out.println("Finalizando");
	}
}
