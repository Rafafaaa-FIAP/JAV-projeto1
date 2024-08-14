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
		aluno.nome = "Joao Pedro";
		aluno.tamanho = 1.79f;
		aluno.cor = "branco";
		aluno.documento = "999999";
		aluno.estudar();
		aluno.jogar();
		aluno.conversar();
		
		System.out.println("Finalizando");
	}
}
