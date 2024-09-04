package lista;


public class Main {
	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		
		lista.addFirst("ELEMENTO 1");
		lista.addFirst("elemento 2");
		lista.addFirst("elemento 3");
		
		
		System.out.println(lista.getFirst());
		System.out.println(lista.getTamanho());
	}
}
