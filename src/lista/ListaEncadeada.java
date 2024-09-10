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
			msg += String.format("Indíce: %d | %s \n", contador, temp.getElemento());
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
		if (index > tamanho || index <= 0) return "Livro não cadastrado"; 
		
		No<T> temp = head;
		No<T> anterior = null;
		String mensagem = "Livro REMOVIDO: ";

		if (index == 1) {
			mensagem += head.getElemento();
			head = head.getProximo();
			tamanho--;
			return mensagem;
		}
		for (int i = 1; i < index; i++) {
			anterior = temp;
			temp = temp.getProximo();
		}
			mensagem += anterior.getProximo().getElemento();
			anterior.setProximo(temp.getProximo());
			tamanho--;
		
		return mensagem;
	}
	
    public void bubbleSort() {
    if (tamanho > 1) {
        for (int i = 0; i < tamanho; i++ ) {
            No<T> atual = head;
            No<T> prox = head.getProximo();
            Livro livroAtual = null;
            Livro livroProx = null;
            
            for (int j = 0; j < tamanho - 1 - i; j++) {
            	  livroAtual = (Livro) atual.getElemento();
                  livroProx = (Livro) prox.getElemento();
                  
                if (livroAtual.getAnoPublicacao() > livroProx.getAnoPublicacao()) {
                    T temp = atual.getElemento();
                    atual.setElemento(prox.getElemento());
                    prox.setElemento(temp);
                } 
                atual = prox;
                prox = prox.getProximo();                   
            } 
        }
    }
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
				5) Ordenar livros por ano
				6) Sair
					""";
	}

}
