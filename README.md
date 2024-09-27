# binary-tree

### Equipe:
    - Carlos Daniel
    - Jefferson Ezequiel
    - Lucas Emanoel
    - Rafaela Bricia
    - Wictor Firmino


## Livraria em Árvore bínaria de busca (BST)

Para segunda fase do projeto implementamos as mesmas funcionalidades da livraria fase 1, porém, desta vez usando árvore binária de busca (BST). Para resolver dúvidas e complexidades que surgiram, utilizamos conceitos discutidos em sala de aula pelo professor, conteúdos disponíveis no GitHub e pesquisas online.

### Referência método adicionar:
Conteúdo disponibilizado pelo professor

### Referência utilizada para o método remover livro:
https://medium.com/swlh/java-how-to-delete-a-node-in-binary-search-tree-aa2d4befe728

### Referência utilizada para o método pesquisar livros:
https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/


## Aplicação de estrutura de dados do tipo árvore 

Como comentado anteriormente, mantivemos as funcionalidades da fase 1. No entanto, como era requisito desta fase, adicionamos a estrutura de dados do tipo árvore. Criamos um arquivo Arvore.java, onde implementamos as funcionalidades necessárias para a árvore em nosso projeto, sempre interligado com os arquivos No.java e Livro.java. No arquivo Main.java, hospedamos os métodos que fazem o menu principal funcionar e que conectam as funcionalidades da árvore com os inputs do usuário.


## Inserção e ordenação dos filhos
Para adicionar os livros mantendo a padronização de uma árvore binária de busca, onde os nós à esquerda da raiz são menores e os à direita são maiores, utilizamos o método compareTo do Java para comparar os títulos dos livros e posicioná-los corretamente na árvore.

## Métodos para exibir os livros
### In-Order
O método inOrder percorre a árvore binária na seguinte ordem: esquerda, raiz, direita, exibindo os livros em ordem crescente de acordo com seus títulos, caso a árvore esteja corretamente organizada como uma árvore binária de busca.
### Pre-Order
O método preOrder percorre a árvore binária na seguinte ordem: raiz, esquerda, direita, exibindo os livros começando pelo título da raiz e, em seguida, seguindo para os livros da subárvore esquerda e, por fim, da subárvore direita.

## Pesquisar livro
O método search percorre a árvore binária de busca para encontrar um nó com um título específico, iniciando pela raiz e utilizando a comparação dos títulos. Se o nó atual for nulo, retorna-se null; se o título do nó corresponder ao título pesquisado, o nó é retornado. Caso contrário, o método decide se deve prosseguir pela subárvore esquerda ou direita, com base na comparação do título, garantindo uma busca eficiente na estrutura da árvore.

## Remoção do livro
O método remover deleta um livro seguindo as regras de estruturação da árvore. Ele recebe dois parâmetros: o nó atual (no) e o livro que se deseja remover (livro). O objetivo é preservar a ordenação da árvore após a remoção, garantindo que os nós à esquerda sejam menores e os à direita sejam maiores em relação à raiz.

