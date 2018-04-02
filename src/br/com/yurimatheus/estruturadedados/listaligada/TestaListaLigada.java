package br.com.yurimatheus.estruturadedados.listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		lista.adicionaNoComeco("Yuri");
		System.out.println(lista);
		lista.adicionaNoComeco("Gabriel");
		System.out.println(lista);
		lista.adiciona("Leo");
		System.out.println(lista);
		lista.adiciona(1, "Matheus");
		System.out.println(lista);
		System.out.println(lista.pega(2));
		lista.removeDoComeco();
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
	}
}
