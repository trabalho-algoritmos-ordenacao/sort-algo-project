import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 3, 5, 1, 2, 8}; // Vetor principal
        int[] aux = new int[arr.length]; // Vetor auxiliar (precisa ter o mesmo tamanho do vetor principal)

        // Metodo, com vetor e auxiliar com posição inial e final
        mergeSort(arr, aux, 0, arr.length-1);
        //Imprime vetor na ordem correta
        System.out.println(Arrays.toString(arr));

    }
    //Metodo responsavel por dividir o vetor e chamar o médoto de intercalação.
    private static void mergeSort(int[] arr, int[] aux, int init, int end){
       if(init < end){
           int mid = (init + end)/ 2; //Encontra o indice medio para divir o vetor
           mergeSort(arr, aux, init, mid);// Divide a primeira metade
           mergeSort(arr, aux,mid+1, end); // Divide a segunda metade
           intercal(arr, aux, init, mid, end); // Metodo que ordena e combina as duas partes
            }
        }
        //Metodo intercala as duas metades do vetor ordenado
        private static void intercal(int[] arr, int[] aux, int init, int mid, int end){
           //Copia os elementos do vetor principal para o auxiliar
            for (int aux1 = init; aux1 <= end; aux1++)
                aux[aux1] = arr[aux1];

            //Inicia os indices para percorrer as duas metades do vetor
            int i = init;
            int j = mid + 1;

            // Intercala as duas metades no vetor principal
            for(int aux1 = init; aux1 <= end; aux1++ ){
                if(i > mid) arr[aux1] = aux[j++]; // Se todos os elementos da primeira já foram usados, copia os da segunda
                else if(j > end) arr[aux1] = aux[i++];// Se todos os elementos da segunda já foram usados, copia os da primeira
                else if (aux[i] < aux[j]) arr[aux1] = aux[i++];// Se o elemento da primeira parte for menor, coloca ele no vetor principal
                else arr[aux1] = aux[j++];//Se não coloca o elemento da segunda metade no vetor principal
            }
        }
    }