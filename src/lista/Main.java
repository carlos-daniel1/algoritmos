package lista;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		ListaEncadeada<Livro> lista = new ListaEncadeada<>();
		
		
		String opcao = "1";
		
		while(!opcao.equals("5")) {
			opcao = JOptionPane.showInputDialog(null, lista.menu(), "Livraria Deus é bom", 1);
			
			if(opcao == null) {
				JOptionPane.showMessageDialog(null, "Opção inválida", "Livraria Deus é bom", 0);
				opcao = "0";
			
			} else if(opcao.equals("1")) {
				String titulo = JOptionPane.showInputDialog(null, 
						"Digite o nome do livro", "Livraria Deus é bom", 1);
				
				String autor = JOptionPane.showInputDialog(
						null, "Digite o autor do livro", "Livraria Deus é bom", 1);
				
				int ano = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Digite o ano de publicação do livro", "Livraria Deus é bom", 1));
				
				Livro novoLivro = new Livro();
				novoLivro.setTitulo(titulo);
				novoLivro.setAutor(autor);
				novoLivro.setAnoPublicacao(ano);
		
				lista.addLast(novoLivro);
				JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", "Livraria Deus é bom", 1);
			
			} else if(opcao.equals("2")) {
				JOptionPane.showMessageDialog(null, lista.getAllElements());
			
			} else if (opcao.equals("3")) {
				String pesquisar = JOptionPane.showInputDialog(null, 
						"Digite o titulo do livro para pesquisar", "Livraria Deus é bom", 1);
				
				JOptionPane.showMessageDialog(null, 
						lista.searchByName(pesquisar), "Livraria Deus é bom", 1);
			}
		}
		
		
		/*
		 * Livro testeLivro = new Livro(); testeLivro.setTitulo("teste");
		 * testeLivro.setAutor("beleza"); testeLivro.setAnoPublicacao(2010);
		 * lista.addLast(testeLivro);
		 */
		
	}
}
