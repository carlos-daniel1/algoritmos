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
		while (temp != null) {
			msg += temp.getElemento() + "\n";
			temp = temp.getProximo();
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
		String msg = "Elemento não encontrado";
		No<T> temp = head;
		Livro pesquisar = null;

		while (temp != null) {
			pesquisar = (Livro) temp.getElemento();
			
			if (pesquisar.getTitulo().equalsIgnoreCase(titulo)) {
				msg = "Elemento encontrado";
				break;
			} else {
				temp = temp.getProximo();
			}
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
				3) Pesquisar livro
				5) Sair
					""";
	}

}
