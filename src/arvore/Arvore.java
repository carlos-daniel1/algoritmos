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
	
	public No remover(No no, Livro livro) {
	    if (no == null) return null;
	    
	    if(raiz.getEsquerdo() == null && raiz.getDireito() == null) {
	    	raiz = null;
	    	return raiz;
	    }

	    if (livro.getTitulo().compareToIgnoreCase(no.getLivro().getTitulo()) > 0) {
	        no.setDireito(remover(no.getDireito(), livro));
	        
	    } else if (livro.getTitulo().compareToIgnoreCase(no.getLivro().getTitulo()) < 0) {
	        no.setEsquerdo(remover(no.getEsquerdo(), livro));
	        
	    } else {
	        if (no.getEsquerdo() == null && no.getDireito() == null) {
	            return null;
	            
	        } else if (no.getDireito() != null) {
	            no.setLivro(sucessor(no));
	            no.setDireito(remover(no.getDireito(), no.getLivro()));
	       
	        } else {	        	
	            no.setLivro(predecessor(no));
	            no.setEsquerdo(remover(no.getEsquerdo(), no.getLivro()));
	        }
	    }

	    return no;
	}

	private Livro sucessor(No no) {
	    No atual = no.getDireito();
	    while (atual.getEsquerdo() != null) {
	        atual = atual.getEsquerdo();
	    }
	    return atual.getLivro();
	}

	private Livro predecessor(No no) {
	    No atual = no.getEsquerdo();
	    while (atual.getDireito() != null) {
	        atual = atual.getDireito();
	    }
	    return atual.getLivro();
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

	public No search(No no, String pesquisar) {
		if (no == null) {
			return null;
		}
		if (no.getTituloLivro().equalsIgnoreCase(pesquisar)) {
			return no;
		}
		if (pesquisar.compareToIgnoreCase(no.getTituloLivro()) < 0) {
			return search(no.getEsquerdo(), pesquisar);
		}
		return search(no.getDireito(), pesquisar);
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
		Livro novoLivro = new Livro("Algoritmos e logica Da Programaçao",
				"Marcelo Marques Gomes, Marcio Vieira Soares e Marco A. Furlan de Souza", 2019);
		insert(raiz, novoLivro);

		Livro novoLivro2 = new Livro("Java Como Programar", "Paul Deitel", 1996);
		insert(raiz, novoLivro2);

		Livro novoLivro3 = new Livro("Aprendendo Banco de Dados MYSQL: Do Básico ao Avançado",
				"Jorge Costa Leite Júnior", 2021);
		insert(raiz, novoLivro3);

		Livro novoLivro4 = new Livro(
				"Curso Intensivo de Python - 3ª edição: Uma Introdução Prática e Baseada em Projetos à Programação ",
				"Eric Matthes", 2023);
		insert(raiz, novoLivro4);

		Livro novoLivro5 = new Livro("A hora da estrela", "Clarice Lispector", 1977);
		insert(raiz, novoLivro5);

		Livro novoLivro6 = new Livro("Mulheres Que Correm Com Os Lobos", "Clarissa Pinkola Estés", 1989);
		insert(raiz, novoLivro6);

		Livro novoLivro7 = new Livro("Orgulho e Preconceito", "Jane Austen", 1813);
		insert(raiz, novoLivro7);

		Livro novoLivro8 = new Livro("Jogos Vorazes", "Suzanne Collins", 2008);
		insert(raiz, novoLivro8);

		Livro novoLivro9 = new Livro("O Principe", "Nicolau Maquíavel", 1532);
		insert(raiz, novoLivro9);

		Livro novoLivro10 = new Livro("O Capital", "Karl Marx", 1867);
		insert(raiz, novoLivro10);

		Livro novoLivro11 = new Livro("Codigo Limpo: Habilidades Práticas do Agile Software", "Robert Cecil Martin",
				2012);
		insert(raiz, novoLivro11);

		Livro novoLivro12 = new Livro("Fundamentos da Arquitetura de Software: uma Abordagem de Engenharia: 1",
				"Mark RichardsMark Richards", 2024);
		insert(raiz, novoLivro12);
	}

	public String menu() {
		return """
				Digite uma opção:
				1) Adicionar Livro
				2) Listar livros
				3) Pesquisar livro
				4) Remover livro
				5) Ordenar livros por titulo
				6) Sair
				""";
	}
}
