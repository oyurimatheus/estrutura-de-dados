package br.com.yurimatheus.estruturadedados.listaligada;

public class ListaLigada {
	
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula novo = new Celula(elemento, primeira);
		primeira = novo;
		
		if(totalDeElementos == 0)
			ultima = primeira;
		
		
		totalDeElementos++;
	}
	
	public void adiciona(Object elemento) {
		if(totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula novo = new Celula(elemento, null);
			ultima.setProximo(novo);
			ultima = novo;
			totalDeElementos++;
		}
	}

	private boolean ehValida(int posicao) {
		return posicao >= 0 && posicao < totalDeElementos;
	}

	private Celula pegaCelula(int posicao) {
		if(!ehValida(posicao))
    		throw new IllegalArgumentException("posicao invalida");
    	Celula atual = primeira;
    	
    	for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
    	return atual;
	}
	
    public void adiciona(int posicao, Object elemento) {
    	if(totalDeElementos == 0) {
    		throw new IllegalArgumentException("lista vazia");
    	} else if(posicao == totalDeElementos) {
    		adiciona(elemento);
    	} else {
			Celula anterior = pegaCelula(posicao - 1);
			Celula novo = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(novo);
			totalDeElementos++;
    	}
    }

    public Object pega(int posicao) { 
    	return pegaCelula(posicao).getElemento();
    }

    public void removeDoComeco() {
    	/**
    	 * Atualiza a primeira posicao da lista
    	 */
    	if(totalDeElementos == 0)
    		throw new IllegalArgumentException("lista vazia");
    	primeira = primeira.getProximo();
    	totalDeElementos--;
    	
    	if(totalDeElementos == 0) {
    		ultima = null;
    	}
    	
    }
    public void remove(int posicao) {
    	Celula anterior = pegaCelula(posicao - 1);
    	anterior.setProximo(anterior.getProximo().getProximo());
    	totalDeElementos--;
    }
    
    public int tamanho() { 
    	return totalDeElementos;
    }

    public boolean contem(Object o) { return false;}
    
    public String toString() {
    	  if(this.totalDeElementos == 0) {
              return "[]";
          }

          Celula atual = primeira;

          StringBuilder builder = new StringBuilder("[");

          for(int i = 0; i < totalDeElementos; i++) {
              builder.append(atual.getElemento());
              builder.append(",");

              atual = atual.getProximo();
          }

          builder.append("]");

          return builder.toString();
    }
}
