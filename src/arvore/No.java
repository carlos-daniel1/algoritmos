package arvore;

public class No {
	private Livro livro;
	private No esquerda;
	private No direita;

	public No(Livro livro) {
		this.livro = livro;
		direita = null;
		esquerda = null;
	}

	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public No getEsquerdo() {
		return esquerda;
	}
	public void setEsquerdo(No esquerdo) {
		this.esquerda = esquerdo;
	}
	public No getDireito() {
		return direita;
	}
	public void setDireito(No direito) {
		this.direita = direito;
	}
	
	public int getAnoLivro() {
		return livro.getAnoPublicacao();
	}

}
