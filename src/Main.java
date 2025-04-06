import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //  10000 || 50000 || 100000 || 300000
        int N = 300000;

        int[] sorted_array = new int[N];
        int[] reversed_array = new int[N];
        int[] random_array = new int[N];

        inicializarVetor(sorted_array, N, 1); // Crescente
        inicializarVetor(reversed_array, N, 2); // Decrescente
        inicializarVetor(random_array, N, 0); // Aleatório

//        exibirVetor(sorted_array, N);
//        exibirVetor(reversed_array, N);
//        exibirVetor(random_array, N);

        long inicio, fim, tempoS, tempoMS;

//        inicio = System.currentTimeMillis();
//        bubbleSort(sorted_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Bubble Sort - Vetor Ordenado: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        bubbleSort(reversed_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Bubble Sort - Vetor Invertido: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        bubbleSort(random_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Bubble Sort - Vetor Aleatório: " + tempoS + "s" + tempoMS + "ms");

//        inicio = System.currentTimeMillis();
//        selection_sort(sorted_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Selection Sort - Vetor Ordenado: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        selection_sort(reversed_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Selection Sort - Vetor Invertido: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        selection_sort(random_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Selection Sort - Vetor Aleatório: " + tempoS + "s" + tempoMS + "ms");

//        inicio = System.currentTimeMillis();
//        insertion_sort(sorted_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Insertion Sort - Vetor Ordenado: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        insertion_sort(reversed_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Insertion Sort - Vetor Invertido: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        insertion_sort(random_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Insertion Sort - Vetor Aleatório: " + tempoS + "s" + tempoMS + "ms");

//        inicio = System.currentTimeMillis();
//        merge_sort(sorted_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Merge Sort - Vetor Ordenado: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        merge_sort(reversed_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Merge Sort - Vetor Invertido: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        merge_sort(random_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Merge Sort - Vetor Aleatório: " + tempoS + "s" + tempoMS + "ms");

//        inicio = System.currentTimeMillis();
//        heapsort(sorted_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Heapsort - Vetor Ordenado: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        heapsort(reversed_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Heapsort - Vetor Invertido: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        heapsort(random_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("Heapsort - Vetor Aleatório: " + tempoS + "s" + tempoMS + "ms");

//        inicio = System.currentTimeMillis();
//        counting_sort(sorted_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("counting_sort - Vetor Ordenado: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        counting_sort(reversed_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("counting_sort - Vetor Invertido: " + tempoS + "s" + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        counting_sort(random_array);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("counting_sort - Vetor Aleatório: " + tempoS + "s" + tempoMS + "ms");

//        inicio = System.currentTimeMillis();
//        quick_sort(sorted_array, 0, sorted_array.length);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("quicksort - Vetor Ordenado: " + tempoS + "s " + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        quick_sort(reversed_array, 0, reversed_array.length);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("quicksort - Vetor Invertido: " + tempoS + "s " + tempoMS + "ms");
//
//        inicio = System.currentTimeMillis();
//        quick_sort(random_array, 0, random_array.length);
//        fim = System.currentTimeMillis();
//        tempoS = (fim - inicio) / 1000;
//        tempoMS = (fim - inicio) - tempoS * 1000;
//        System.out.println("quicksort - Vetor Aleatório: " + tempoS + "s " + tempoMS + "ms");
    }

    public static void inicializarVetor(int vet[], int N, int s) {
        switch(s){
            case 0:
                for (int i = 0; i < N; i++)
                    vet[i] = (int) (Math.random() * (N * 2));
                break;
            case 1:
                for (int i = 0; i < N; i++)
                    vet[i] = i+1;
                break;
            case 2:
                for (int i = 0; i < N; i++)
                    vet[i] = N - i;
                break;
        }
    }

    private static void exibirVetor(int[] vet, int N) {
        for (int i = 0; i < N; i++) {
            if (vet[i] < 10) {
                System.out.print("0" + vet[i] + " ");
            } else {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void selection_sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void insertion_sort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }

    public static void merge_sort(int[] array) {
        if (array.length < 2) return;

        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        merge_sort(left);
        merge_sort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void heapsort(int[] array) {
        int n = array.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap current root (max) with the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }

    public static void counting_sort(int[] array) {
        if (array.length == 0) return;

        // Find the maximum value in the array
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        // Initialize the count array
        int[] count = new int[max + 1];

        // Store the frequency of each element
        for (int num : array) {
            count[num]++;
        }

        // Rebuild the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static void quick_sort(int[] array, int begin, int end) {
        if (begin >= end - 1) return; // Caso base: array de 1 ou 0 elementos já está ordenado

        int i = begin;
        int j = end - 1;
        int pivot = array[begin + (end - begin) / 2];
        int aux;

        while (i <= j) {
            while (i < end && array[i] < pivot) i++;
            while (j >= begin && array[j] > pivot) j--;

            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }

        if (begin < j) quick_sort(array, begin, j + 1);
        if (i < end) quick_sort(array, i, end);
    }
}