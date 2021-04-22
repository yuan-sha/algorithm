import java.util.HashMap;
import java.util.Map;

//target weigt -> 10
//2^n 2 to the power of n
public class Knapsack {
    private int[] weight;
    private int[] value;
    private Integer [][] cc = new Integer[5][5];
    private int getValue(int n, int c){
        if(cc[n][c]!=null){
            return cc[n][c];
        }
        int result = 0;
        if(n==0 || c == 0){
            result = 0;
        }else if(weight[n]>c){
            result = getValue(n-1,c);
        }else{
            int temp1 = getValue(n-1,c);
            int temp2 = value[n] + getValue(n-1,c-weight[n]);
            result = Integer.max(temp1,temp2);
        }
        cc[n][c] = result;
        return result;
    }

    public static void main(String[] args) {
        Map mapI = new HashMap<Object, Object>();
        mapI.put(1,2);
        System.out.println(mapI.containsKey(2));

    }
}
