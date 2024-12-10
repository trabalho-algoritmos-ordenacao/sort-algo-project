public class HeapSort {
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

    // Para reorganizar uma subárvore com raiz no nó i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Inicializa o maior como raiz
        int left = 2 * i + 1; // Filho esquerdo
        int right = 2 * i + 2; // Filho direito

        // Se o filho esquerdo for maior que a raiz
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Se o filho direito for maior que o maior até agora
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Se o maior não for a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente reorganiza a subárvore afetada
            heapify(arr, n, largest);
        }
    }

    // Método utilitário para imprimir o array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Adiciona uma nova linha após imprimir o array
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Array original:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Array ordenado:");
        printArray(arr);
    }
}