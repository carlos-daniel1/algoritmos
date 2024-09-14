# Algoritmos  
Equipe:  
Carlos Daniel  
Jefferson Ezequiel  
Lucas Emanoel  
Rafaela Bricia  
Wictor Firmino  

## Livraria em LinkedList  
Apesar de ter uma complexidade maior que listas sequenciais, nosso grupo decidiu  
construir a livraria baseada em lista encadeada. A explicação do professor forneceu  
uma boa compreensão do assunto, e as dúvidas que surgiram foram solucionadas  
em pesquisas no Learning Path, somadas a conteúdos encontrados em fóruns  
e outros sites com conteúdo informativo.  

## Algoritmo de ordenação  
Escolhemos o algoritmo de ordenação Bubble Sort para ordenar os livros.  
Ele funciona comparando os elementos da lista e trocando suas posições  
quando necessário. A cada iteração do for, o maior elemento não ordenado "sobe"  
para a posição correta, movendo os maiores elementos para o fim da lista,  
retornando uma lista ordenada de forma crescente.  

### Comparação dos títulos  
Para comparar os títulos dos livros e ordenar alfabeticamente, utilizamos  
o método compareTo do Java, que compara os valores Unicodes de cada caractere  
na String. Caso tenham o mesmo valor, o método retorna 0. Se a primeira string  
tiver um valor maior, o método retorna um número positivo.
