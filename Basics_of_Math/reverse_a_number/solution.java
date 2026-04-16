public class solution {
   
    public int reverseNumber(int n) {
        int revNum = 0;

        while(n != 0){
            int ld = n % 10;
            revNum = revNum * 10 + ld;
            n = n / 10;
        }

        return revNum;
    }
    public static void main(String[] args) {
        solution sol = new solution();
        int n = 12345;
        int result = sol.reverseNumber(n);
        System.out.println("The reverse of " + n + " is: " + result);
    }
}
