import java.lang.reflect.Array;

//1. Recursion 2. Store(memoize) 3. Bottom-up
public class Fibonacci_dynamic {


    public static void main(String[] args) {
        Integer[] memo = new Integer[8];
        System.out.println(getN(7,memo));
    }

    private static int getN(int n, Integer[] memo){
        if(memo[n] != null){
            return memo[n];
        }
        int result = 0;
        if(n == 1 || n == 2){
            result =  1;
        }else {
            result =  getN(n - 1,memo) + getN(n - 2,memo);
            memo[n]= result;
        }
        return result;
    }
}
