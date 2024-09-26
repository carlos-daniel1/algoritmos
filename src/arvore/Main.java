package arvore;

import javax.swing.JOptionPane;

public class Main {
	static Arvore arvore = new Arvore();
	static int ordenar = 0;

	public static void main(String[] args) {
		//arvore.addLivros();
		String opcao = "1";

		while (!opcao.equals("6")) {
			opcao = JOptionPane.showInputDialog(null, arvore.menu(), "Livraria Deus é bom", 1);

			if (opcao == null) {
				opcao = "5";

			} else if (opcao.equals("1")) {
				adicionarLivro();

			} else if (opcao.equals("2")) {
				listarLivros();

			} else if (opcao.equals("3")) {
				pesquisarLivro();

			} else if (opcao.equals("4")) {
				removerLivro();

			} else if (opcao.equals("5")) {
				ordenarLivros();

			} else if (opcao.equals("6")) {
				JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema!", "Livraria Deus é bom", 1);

			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!", "Livraria Deus é bom", 2);
			}
		}
	}

	private static void adicionarLivro() {
		String titulo = JOptionPane.showInputDialog(null, "Digite o titulo do livro", "Livraria Deus é bom", 1);
		if (titulo == null || titulo.equals(""))
			return;

		if (arvore.search(arvore.getRaiz(), titulo)!= null) {
			JOptionPane.showMessageDialog(null, "Livro já cadastrado no sistema!", "Livraria Deus é bom", 2);
			return;
		}

		String autor = JOptionPane.showInputDialog(null, "Digite o autor do livro", "Livraria Deus é bom", 1);
		if (autor == null || autor.equals(""))
			return;

		String anoStr = JOptionPane.showInputDialog(null, "Digite o ano de publicação do livro", "Livraria Deus é bom",
				1);
		if (anoStr == null)
			return;

		boolean isNumeric = anoStr.chars().allMatch(Character::isDigit);
		if (anoStr.equals("") || !isNumeric) {
			JOptionPane.showMessageDialog(null, "Digite ano válido!", "Livraria Deus é bom", 2);
			return;
		}

		int ano = Integer.parseInt(anoStr);

		Livro novoLivro = new Livro(titulo, autor, ano);
		arvore.insert(arvore.getRaiz(), novoLivro);

		JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", "Livraria Deus é bom", 1);

	}

	private static void listarLivros() {
		if (arvore.getRaiz() == null) {
			JOptionPane.showMessageDialog(null, "Não há livros para listar", "Livraria Deus é bom", 1);
			return;
		}
		if (ordenar == 0) {
			JOptionPane.showMessageDialog(null, arvore.preOrder(arvore.getRaiz()), "Livraria Deus é bom", 1);
			return;
		}
		JOptionPane.showMessageDialog(null, arvore.inOrder(arvore.getRaiz()), "Livraria Deus é bom", 1);

	}

	private static void pesquisarLivro() {
		if (arvore.getRaiz() == null) {
			JOptionPane.showMessageDialog(null, "Não há livros cadastrados!", "Livraria Deus é bom", 1);
			return;
		}

		String pesquisar = JOptionPane.showInputDialog(null, "Digite o titulo do livro para pesquisar",
				"Livraria Deus é bom", 1);
		if (pesquisar == null)
			return;

		if (arvore.search(arvore.getRaiz(), pesquisar) != null) {
			JOptionPane.showMessageDialog(null, pesquisar.toUpperCase() + " encontrado", "Livraria Deus é bom", 1);
			return;
		}

		JOptionPane.showMessageDialog(null, "Livro não encontrado!", "Livraria Deus é bom", 1);

	}

	private static void removerLivro() {
			if (arvore.getRaiz() == null) {
				JOptionPane.showMessageDialog(null, "Não há livros cadastrados!", "Livraria Deus é bom", 1);
				return;
			}
	
			String pesquisa = JOptionPane.showInputDialog(null, "Digite o título do livro que deseja remover",
					"Livraria Deus é bom", 1);
			if (pesquisa == null || pesquisa.trim().isEmpty()) {
				return;
			}
	
			No livroEncontrado = arvore.search(arvore.getRaiz(), pesquisa.trim());
	
			if (livroEncontrado != null) {
				String tituloRemovido = livroEncontrado.getLivro().getTitulo();
				arvore.remover(arvore.getRaiz(), livroEncontrado.getLivro());
				JOptionPane.showMessageDialog(null, tituloRemovido + " removido", "Livraria Deus é bom", 1);
			} else {
				JOptionPane.showMessageDialog(null, "Livro não encontrado!", "Livraria Deus é bom", 1);
			}
	}
	

	private static void ordenarLivros() {
		if (arvore.getRaiz() == null) {
			JOptionPane.showMessageDialog(null, "Não há livros para ordenar", "Livraria Deus é bom", 1);
			return;
		}
		ordenar = 1;
		JOptionPane.showMessageDialog(null, "Livros ordenados com sucesso!", "Livraria Deus é bom", 1);
		JOptionPane.showMessageDialog(null, arvore.inOrder(arvore.getRaiz()), "Livraria Deus é bom", 1);
	}
}
