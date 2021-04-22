public class Fibonacci_bottomup {
    public static void main(String[] args) {
        System.out.println(getN(7));
    }

    private static int getN(int n){
        if(n ==1 || n==2){
            return 1;
        }
        Integer[] memo = new Integer[n+1];
        memo[1] = 1;
        memo[2] = 1;
        for (int i = 3; i <= n; i++) {
            int a = memo[i-1];
            int b = memo[i-2];
            memo[i] = a + b;
        }
        return memo[n];
    }
}
