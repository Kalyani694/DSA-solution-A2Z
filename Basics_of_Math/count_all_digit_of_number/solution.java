public class solution {
     public int countDigits(int n) {
        // Special case
        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            n = n / 10;  // remove last digit
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        solution sol = new solution();
        int n = 12345;
        int result = sol.countDigits(n);
        System.out.println("The number of digits in " + n + " is: " + result);
    }
}
