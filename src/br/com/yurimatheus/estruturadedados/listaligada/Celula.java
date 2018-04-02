package br.com.yurimatheus.estruturadedados.listaligada;

public class Celula {
	/**
	 * As celulas de nossa lista
	 * Elas guardam o elemento e o proximo elemento da lista
	 */
	private Object elemento;
	private Celula proximo;

	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return elemento;
	}
	
	public Celula getProximo() {
		return proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
