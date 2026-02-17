public class q76_PrintSubarrayWithMaxSum {

    

public static void maxSubarrayPrint(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    int start = 0;
    int ansStart = 0;
    int ansEnd = 0;

    for(int i = 0; i < arr.length; i++) {

        if(currSum == 0) {
            start = i;
        }

        currSum += arr[i];

        if(currSum > maxSum) {
            maxSum = currSum;
            ansStart = start;
            ansEnd = i;
        }

        if(currSum < 0) {
            currSum = 0;
        }
    }

    System.out.println("Max Sum = " + maxSum);
    System.out.print("Subarray = ");

    for(int i = ansStart; i <= ansEnd; i++) {
        System.out.print(arr[i] + " ");
    }
}
}