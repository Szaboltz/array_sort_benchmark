import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sorted_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversed_array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] random_array = new int[10];

        for (int x = 0; x < 10; x++){
            random_array[x] = random.nextInt(10);
        }

//        bubbleSort(sorted_array);
//        bubbleSort(reversed_array);
//        bubbleSort(random_array);
//        selection_sort(sorted_array);
//        selection_sort(reversed_array);
//        selection_sort(random_array);
//        insertion_sort(sorted_array);
//        insertion_sort(reversed_array);
//        insertion_sort(random_array);
//        merge_sort(sorted_array);
//        merge_sort(reversed_array);
//        merge_sort(random_array);
//        heapsort(sorted_array);
//        heapsort(reversed_array);
//        heapsort(random_array);
//        counting_sort(sorted_array);
//        counting_sort(reversed_array);
//        counting_sort(random_array);
//        quick_sort(sorted_array, 0, sorted_array.length - 1);
//        quick_sort(reversed_array, 0, reversed_array.length - 1);
//        quick_sort(random_array, 0, random_array.length - 1);


        for (int num : sorted_array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        for (int num : reversed_array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        for (int num : random_array) {
            System.out.print(num + " ");
        }
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

    public static void quick_sort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after the pivot
            quick_sort(array, low, pivotIndex - 1);
            quick_sort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition index
    }
}