package br.com.yurimatheus.estruturasdedados.vetor;
import java.util.Arrays;

public class Vetor {
	
	/**
	 * Estrutura sequencial, isto eh, os dados sao armazenados um ao lado do outro
	 * No Java ja existe a implementacao da classe ArrayList, que trabalha internamente com um Array
	 */
	
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		for(int i = totalDeAlunos - 1; i >= posicao; i--) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}

    public Aluno pega(int posicao) {
        if(!posicaoEhValida(posicao))
        	throw new IllegalArgumentException("posicao invalida");
    	return alunos[posicao];
    }

    private boolean posicaoEhValida(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	public void remove(int posicao) {
		for(int i = posicao; posicao < totalDeAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
		alunos[totalDeAlunos] = null;
		totalDeAlunos--;
	}

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i]))
				return true;
		}
        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
    
    public void garanteEspaco() {
    	if(totalDeAlunos == alunos.length) {
    		Aluno[] novoAlunos = new Aluno[alunos.length * 2];
    		for (int i = 0; i < alunos.length; i++) {
				novoAlunos[i] = alunos[i];
			}
    		this.alunos = novoAlunos;
    	}
    }
}
