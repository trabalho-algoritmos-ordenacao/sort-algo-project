public class InsertionSort {

    // Classe Produto para representar os itens do supermercado
    static class Produto {
        String nome;  // Nome do produto
        double preco; // Preço do produto

        // Construtor da classe Produto
        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        // Método para exibir os dados do produto
        @Override
        public String toString() {
            return nome + " - R$" + String.format("%.2f", preco);
        }
    }

    // Algoritmo de Insertion Sort para ordenar os produtos pelo preço
    public static void insertionSort(Produto[] lista) {
        int n = lista.length;

        // Passando por cada produto da lista (começa do segundo produto)
        for (int i = 1; i < n; i++) {
            Produto chave = lista[i]; // Produto a ser inserido
            int j = i - 1;

            // Move os elementos maiores que a chave uma posição à frente
            while (j >= 0 && lista[j].preco > chave.preco) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j + 1] = chave; // Coloca a chave na posição correta
        }
    }

    // Método principal (main) que demonstra o funcionamento do algoritmo
    public static void main(String[] args) {
        // Criando um array de objetos Produto com os itens do supermercado
        Produto[] listaDeProdutos = {
                new Produto("Arroz", 6.00),
                new Produto("Feijão", 8.00),
                new Produto("Café", 15.00),
                new Produto("Chocolate", 5.00),
                new Produto("Cerveja", 3.00),
                new Produto("Banana", 3.50)
        };

        // Exibindo a lista antes da ordenação
        System.out.println("Lista de Produtos antes da ordenação:");
        for (Produto p : listaDeProdutos) {
            System.out.println(p);  // Exibe nome e preço de cada produto
        }

        // Ordenando a lista de produtos usando o Insertion Sort
        insertionSort(listaDeProdutos);

        // Exibindo a lista após a ordenação
        System.out.println("\nLista de Produtos após a ordenação:");
        for (Produto p : listaDeProdutos) {
            System.out.println(p);  // Exibe nome e preço de cada produto ordenado
        }
    }
}
