package lista;

public class ListaEncadeada<T> {

	private No<T> head;
	private int tamanho;

	public ListaEncadeada() {
		this.head = null;
		this.tamanho = 0;
	}

	public void addFirst(T elemento) {
		No<T> novoNo = new No<T>(elemento);
		No<T> temp = head;
		head = novoNo;
		head.setProximo(temp);
		tamanho++;
	}

	public T getFirst() {
		return head.getElemento();
	}
	
	public int getTamanho() {
		return tamanho;
	}

}
