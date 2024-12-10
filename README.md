<<<<<<< HEAD
# group-sort-challenge

Group project to implement and study sorting algorithms, focusing on efficiency and use cases.

## 📚 Sobre o Projeto

Este repositório faz parte do programa **Catalisa** e contém implementações de diferentes algoritmos de ordenação. O objetivo é estudar e comparar a eficiência desses algoritmos em diferentes cenários e conjuntos de dados. Atualmente, o projeto inclui a implementação do **Heap Sort**, um algoritmo eficiente de ordenação baseado na estrutura de dados Heap.

## 🚀 Algoritmo Implementado: Heap Sort

O **Heap Sort** é um algoritmo de ordenação que utiliza a estrutura de dados Heap para organizar os elementos de um array. Ele possui complexidade de tempo **O(n log n)** no pior caso, tornando-o uma escolha eficiente para grandes conjuntos de dados.

### 🧩 Funcionamento do Heap Sort

1. Constrói um Max-Heap a partir do array original.
2. Remove o maior elemento (raiz do heap) e o coloca no final do array.
3. Reorganiza o heap para manter a propriedade de Max-Heap.
4. Repete os passos 2 e 3 até que todos os elementos estejam ordenados.

🛠️ Como Executar
1. 
Clone o repositório:
1git clone https://github.com/trabalho-algoritmos-ordenacao/sort-algo-project
2cd group-sort-challenge
2. 
Compile o código:
1javac HeapSort.java
3. 
Execute o programa:
1java HeapSort
📋 Exemplo de Saída
1Array original: 12 11 13 5 6 7
2Array ordenado: 5 6 7 11 12 13
=======
Insertion Sort (Ordenação por Inserção) é um algoritmo de ordenação que funciona como se você estivesse organizando cartas de baralho na sua mão, colocando cada nova carta na posição correta.

Como funciona o Insertion Sort
1. Início: Comece do segundo item da lista (o primeiro já está "ordenado").
2. Comparar e Inserir: Compare o item atual com os itens anteriores e mova os itens maiores para a direita até encontrar a posição certa para o item atual.
3. Repetir: Faça isso para todos os itens da lista, um por um, até a lista inteira estar ordenada.

Exemplo Simples (Utilizando os produtos do supermercado no código)

- Lista inicial: 
  Arroz - R$6.00
  Feijão - R$8.00
  Café - R$15.00
  Chocolate - R$5.00
  Cerveja - R$3.00
  Banana - R$3.50
 
1. Primeiro, comparamos o segundo item (Feijão - R$8.00) com o primeiro (Arroz - R$6.00). Como o preço de Feijão é maior, não fazemos nada. A lista continua igual: 

  Arroz - R$6.00
   Feijão - R$8.00
   Café - R$15.00
   Chocolate - R$5.00
   Cerveja - R$3.00
   Banana - R$3.50
   
2. O próximo item é o Café (R$15.00). Como ele já está na posição correta, não fazemos nada. A lista continua:

   Arroz - R$6.00
   Feijão - R$8.00
   Café - R$15.00
   Chocolate - R$5.00
   Cerveja - R$3.00
   Banana - R$3.50
 
3. Comparamos o Chocolate (R$5.00) com os itens anteriores. Como R$5.00 é menor que R$6.00 (Arroz), movemos o Arroz para a direita e colocamos o Chocolate na primeira posição. A lista fica:

  Chocolate - R$5.00
   Arroz - R$6.00
   Feijão - R$8.00
   Café - R$15.00
   Cerveja - R$3.00
   Banana - R$3.50

4. Comparamos a Cerveja (R$3.00) com os itens anteriores. Ela é menor do que todos, então vai para a primeira posição. A lista se torna:

   Cerveja - R$3.00
   Chocolate - R$5.00
   Arroz - R$6.00
   Feijão - R$8.00
   Café - R$15.00
   Banana - R$3.50
 
5. Comparamos a Banana (R$3.50) com os itens anteriores. Ela é maior que a Cerveja, mas menor que o Chocolate, então ela vai para a segunda posição. A lista se torna:

  Cerveja - R$3.00
   Banana - R$3.50
   Chocolate - R$5.00
   Arroz - R$6.00
   Feijão - R$8.00
   Café - R$15.00

6. A lista está agora completamente ordenada em ordem crescente de preço.

O código mostra como ordenar uma lista de produtos de supermercado por preço:
Produtos
- Arroz - R$6,00
- Feijão - R$8,00
- Café - R$15,00
- Chocolate - R$5,00
- Cerveja - R$3,00
- Banana - R$3,50

Funcionamento do Código:
1. O algoritmo começa com o segundo produto (Feijão), compara com o produto anterior e coloca ele na posição correta.
2. Repete esse processo para todos os produtos até a lista estar ordenada pelos preços.

Para ler mais a respeito:
https://www.devmedia.com.br/algoritmos-de-ordenacao-em-java/32693 

Executando o código:

1. Instalar o JDK (Java Development Kit):
   - Faça o download e instale o JDK. 

2. Baixe o código:
   - Clone o repositório ou baixe os arquivos para o seu computador.

3. Compile o código:
   - Abra o terminal ou prompt de comando na pasta onde o código está salvo.
   - Execute o comando:
     `javac InsertionSort.java
     
4. Execute o programa:
   - Após compilar, execute o código com o comando:
     java InsertionSort
     
