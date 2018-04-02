package br.com.yurimatheus.estruturasdedados.vetor;

public class Aluno {
	
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.getNome().equals(outro.getNome());
	}
	
	public String toString() {
		return nome;
	}
}