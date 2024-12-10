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

### 📄 Trecho de Código

Abaixo está um trecho da implementação do Heap Sort presente no repositório:

```java
public static void heapSort(int[] arr) {
    int n = arr.length;

    // Constrói o heap (reorganiza o array)
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    // Extrai elementos do heap um por um
    for (int i = n - 1; i > 0; i--) {
        // Move a raiz atual para o final
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Chama heapify no heap reduzido
        heapify(arr, i, 0);
    }
}
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
