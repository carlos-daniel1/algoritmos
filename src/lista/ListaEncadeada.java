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

	public String getAllElements() {
		String msg = "";
		No<T> temp = head;
		int contador = 1;
		while (temp != null) {
			msg += String.format("Id: %d | %s \n", contador, temp.getElemento());
			temp = temp.getProximo();
			contador++;
		}
		return msg;
	}

	public void addLast(T elemento) {
		No<T> novoNo = new No<T>(elemento);
		No<T> temp = head;
		if (head == null) {
			head = novoNo;
		} else {
			while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(novoNo);
		}
		tamanho++;
	}

	public String searchByName(String titulo) {
		String msg = "Livro não encontrado";
		No<T> temp = head;
		Livro pesquisar = null;

		while (temp != null) {
			pesquisar = (Livro) temp.getElemento();

			if (pesquisar.getTitulo().equalsIgnoreCase(titulo)) {
				msg = String.format("Livro %s encontrado", pesquisar.getTitulo());
				break;
			} else {
				temp = temp.getProximo();
			}
		}
		return msg;
	}

	public String remove(int index) {
		No<T> temp = head;
		No<T> prev = null;
		String msg = "Livro REMOVIDO: ";

		if (index == 1) {
			msg += head.getElemento();
			head = head.getProximo();
			tamanho--;
			return msg;
		}
		
		for (int i = 1; temp != null && i < index; i++) {
			prev = temp;
			temp = temp.getProximo();
		}
		if (temp != null && index != 0) {
			msg += prev.getProximo().getElemento();
			prev.setProximo(temp.getProximo());
			tamanho--;
			
		} else {
			msg = "Livro não encontrado";
		}
		return msg;
	}
	

	public T getFirst() {
		return head.getElemento();
	}

	public int getSize() {
		return tamanho;
	}

	public String menu() {
		return """
				Digite uma opção:
				1) Adicionar livro
				2) Listar livros
				3) Pesquisar livro pelo nome
				4) Remover livro
				5) Sair
					""";
	}

}
