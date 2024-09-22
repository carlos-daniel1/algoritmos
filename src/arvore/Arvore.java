package arvore;

public class Arvore {
	private No raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public void insert(Livro livro) {
		insertRecursive(raiz, livro);
	}
	
	private No insertRecursive(No no, Livro livro) {
		if(raiz != null) {
			if(livro.getAnoPublicacao() < no.getAnoLivro()) {
				
				if(no.getEsquerdo() != null) {
					insertRecursive(no.getEsquerdo(), livro);
				} else {
					no.setEsquerdo(new No(livro));
				}
				
			} else if(livro.getAnoPublicacao() > no.getAnoLivro()) {
				if(no.getDireito() != null) {
					insertRecursive(no.getDireito(), livro);				
				} else {
					no.setDireito(new No(livro));
				}
			}	
			
		} else {
			raiz = new No(livro);
		}
		return no;
	}
	
	
	public String getAll() {
		return preOrder(raiz);
	}
	
	private String preOrder(No no) {
		String msg = "";
		if(no != null) {
			msg += no.getLivro() + "\n";
			msg += preOrder(no.getEsquerdo());
			msg += preOrder(no.getDireito()); 
		}
		return msg;
	}
		
	public void addLivros() {
		Livro novoLivro = new Livro("livro A", "opa", 10);
		insert(novoLivro);
		
		Livro novoLivro2 = new Livro("livro B", "opa", 5);
		insert(novoLivro2);
		
		Livro novoLivro3 = new Livro("livro C", "opa", 8);
		insert(novoLivro3);
	}
	
	public String menu() {
		return """
				1) Adicionar Livro
				2) Listar livros
				6) Sair
				""";
	}
}
