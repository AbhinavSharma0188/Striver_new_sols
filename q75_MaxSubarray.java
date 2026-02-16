public class q75_MaxSubarray {

    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int largest = nums[0]; // Start with the first element
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            current += nums[i];  // Add the current element
            largest = Math.max(largest, current);  // Update max sum

            // Reset current sum if it becomes negative
            if (current < 0) {
                current = 0;
            }
        }

       System.out.println(largest);
        
    }
    
}
