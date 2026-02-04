import java.util.HashMap;

class Main{
    public static void main(String[] args) {
        int arr[] = {15, 16, 27, 27, 28, 15};

        HashMap<Integer, Integer> result = new HashMap<>();

        // Step 1: Create frequency map
        for (int i = 0; i < arr.length; i++) {
            if (result.containsKey(arr[i])) {
                result.put(arr[i], result.get(arr[i]) + 1);
            } else {
                result.put(arr[i], 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = 0;
        int minElement = 0;

        // Step 2: Normal loop using array (very easy)
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int freq = result.get(element);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = element;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = element;
            }
        }

        System.out.println("Highest frequency element: " + maxElement + " -> " + maxFreq);
        System.out.println("Lowest frequency element: " + minElement + " -> " + minFreq);
    }
}
