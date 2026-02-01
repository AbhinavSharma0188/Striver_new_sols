class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int temp = n;
        int digits = 0;
        int sum = 0;

        // Step 1: Count number of digits
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n; // reset temp

        // Step 2: Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Step 3: Check
        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
