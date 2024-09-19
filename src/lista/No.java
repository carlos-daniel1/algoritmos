package lista;

public class No {
	private Livro livro;
	private No esquerdo;
	private No direito;

	public No(Livro livro, No esquerdo, No direito) {
		this.livro = livro;
		this.esquerdo = esquerdo;
		this.direito = direito;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}

}
