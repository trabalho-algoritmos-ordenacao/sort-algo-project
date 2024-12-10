import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 3, 5, 1, 2, 8}; // Vetor principal
        int[] aux = new int[arr.length]; // Vetor auxiliar para as comparações
        // (precisa ter o mesmo tamanho do vetor principal)

        mergeSort(arr, aux, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void mergeSort(int[] arr, int[] aux, int init, int end){
       if(init < end){
           int mid = (init + end)/ 2;
           mergeSort(arr, aux, init, mid);
           mergeSort(arr, aux,mid+1, end);
           intercal(arr, aux, init, mid, end);
            }
        }
        private static void intercal(int[] arr, int[] aux, int init, int mid, int end){
            for (int aux1 = init; aux1 <= end; aux1++)
                aux[aux1] = arr[aux1];


            int i = init;
            int j = mid + 1;

            for(int aux1 = init; aux1 <= end; aux1++ ){
                if(i > mid) arr[aux1] = aux[j++];
                else if(j > end) arr[aux1] = aux[i++];
                else if (aux[i] < aux[j]) arr[aux1] = aux[i++];
                else arr[aux1] = aux[j++];
            }
        }
    }