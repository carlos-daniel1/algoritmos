package arvore;

public class Arvore {
	private No raiz;

	public Arvore() {
		this.raiz = null;
	}

	public No getRaiz() {
		return raiz;
	}

	public No insert(No no, Livro livro) {
		if (raiz == null) {
			raiz = new No(livro);
			return raiz;
		}
		if (livro.getTitulo().compareToIgnoreCase(no.getTituloLivro()) < 0) {
			if (no.getEsquerdo() != null) {
				insert(no.getEsquerdo(), livro);
			} else {
				no.setEsquerdo(new No(livro));
			}
		} else if (livro.getTitulo().compareToIgnoreCase(no.getTituloLivro()) > 0) {

			if (no.getDireito() != null) {
				insert(no.getDireito(), livro);
			} else {
				no.setDireito(new No(livro));
			}
		}
		return no;
	}

	public String preOrder(No no) {
		String msg = "";
		if (no != null) {
			msg += no.getLivro() + "\n";
			msg += preOrder(no.getEsquerdo());
			msg += preOrder(no.getDireito());
		}
		return msg;
	}

	public Boolean searchByTitle(No no, String pesquisar) {
		if (no == null) {
			return false;
		}
		if (no.getTituloLivro().equalsIgnoreCase(pesquisar)) {
			return true;
		}
		if (pesquisar.compareToIgnoreCase(no.getTituloLivro()) < 0) {
			return searchByTitle(no.getEsquerdo(), pesquisar);
		}
		return searchByTitle(no.getDireito(), pesquisar);
	}

	public String inOrder(No no) {
		String msg = "";
		if (no != null) {
			msg += inOrder(no.getEsquerdo());
			msg += no.getLivro() + "\n";
			msg += inOrder(no.getDireito());
		}
		return msg;
	}

	public void addLivros() {
		Livro novoLivro = new Livro("algoritmos", "teste", 2010);
		insert(raiz, novoLivro);

		Livro novoLivro2 = new Livro("java 5", "teste", 2011);
		insert(raiz, novoLivro2);

		Livro novoLivro3 = new Livro("banco de dados", "teste", 2008);
		insert(raiz, novoLivro3);

		Livro novoLivro4 = new Livro("python", "teste", 2009);
		insert(raiz, novoLivro4);
	}

	public String menu() {
		return """
				Digite uma opção:
				1) Adicionar Livro
				2) Listar livros
				3) Pesquisar livro
				5) Ordenar livros por titulo
				6) Sair
				""";
	}
}
