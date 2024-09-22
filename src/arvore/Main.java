package arvore;

import javax.swing.JOptionPane;

public class Main {
	static Arvore arvore = new Arvore();
	
	public static void main(String[] args) {	
		arvore.addLivros();
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

			} else if(opcao.equals("6")) {
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
		
		/*
		 * if(!lista.searchByTitle(titulo).equals("Livro não encontrado")) {
		 * JOptionPane.showMessageDialog(null, "Livro já cadastrado no sistema!",
		 * "Livraria Deus é bom", 2); return; }
		 */

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
		arvore.insert(novoLivro);
		
		JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", "Livraria Deus é bom", 1);
		
	}

	private static void listarLivros() {
		JOptionPane.showMessageDialog(null, arvore.getAll(), "Livraria Deus é bom", 1);
		
	}

	private static void pesquisarLivro() {
		// TODO Auto-generated method stub
		
	}

	private static void removerLivro() {
		// TODO Auto-generated method stub
		
	}
}
