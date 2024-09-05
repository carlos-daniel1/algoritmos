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
				String nomeLivro = JOptionPane.showInputDialog(null, 
						"Digite o nome do livro", "Livraria Deus é bom", 1);
				
				String autorLivro = JOptionPane.showInputDialog(
						null, "Digite o autor do livro", "Livraria Deus é bom", 1);
				
				int anoLivro = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Digite o a do livro", "Livraria Deus é bom", 1));
				
				Livro novoLivro = new Livro();
				
				lista.addLast(novoLivro);
				JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!", "Livraria Deus é bom", 1);
			}
		}
		
		
		/*
		 * System.out.println(lista.getFirst()); System.out.println(lista.size());
		 */

		
	}
}
