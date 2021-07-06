package quicksort;

class quicksort_methods {
    public static void quickSort(int[] ARR, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(ARR, low, high); // pivotIndex е partitioning index

            quickSort(ARR, low, pivotIndex - 1); //  масив с числа по-малки от pivotIndex
            quickSort(ARR, pivotIndex + 1, high); //  масив с числа по-големи от pivotIndex
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1; // индекс на по-малкия елемент

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // ако текущия елемент е по-малък от arr[high]
                i++;

                // размяна на arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // размяна на arr[i+1] и arr[high]
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;

        return i + 1;
    }
}