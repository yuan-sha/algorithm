public class Fibonacci_Recursion {
    public static void main(String[] args) {
        System.out.println(getN(7));
    }

    private static int getN(int n){
        if(n == 1 || n == 2){
            return 1;
        }

        return getN(n-1) + getN(n-2);
    }
}
