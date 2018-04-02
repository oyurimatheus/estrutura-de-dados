package br.com.yurimatheus.estruturasdedados.vetor;

public class TestaVetor {
	
	public static void main(String[] args) {
		Vetor alunos = new Vetor();
		Aluno a1 = new Aluno("Joao");
		alunos.adiciona(a1);
		System.out.println(alunos);
		System.out.println(alunos.tamanho());
		System.out.println(alunos.pega(0));
		Aluno a2 = new Aluno("Maria");
		System.out.println(alunos.contem(a1));
		System.out.println(alunos.contem(a2));
		alunos.adiciona(0, a2);
		System.out.println(alunos);
	}
}