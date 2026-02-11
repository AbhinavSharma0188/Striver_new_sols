public class q56_SelectionSortRecursive {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1, 2};

        selectionSort(arr, 0);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void selectionSort(int arr[], int index) {

        // Base case
        if (index == arr.length - 1) return;

        // Find min index
        int minIndex = index;

        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap
        int temp = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = temp;

        // Recursive call
        selectionSort(arr, index + 1);
    }
    
    
}
