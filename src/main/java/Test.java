import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        if(!"38500839".equals("38500839") || !"CRCOM".equals("CRCOM")){
            System.out.println("test");
        }
        System.out.println("CRCOM".concat("_ARIA"));
    }

    public static String encoding(String msg, String key){
        List<Character> anslist = new ArrayList<>();

        int i = 0; // for msg
        int j = 0; //for key

        int msgSize = msg.length();
        int keySize = key.length();

        if(msgSize==0||keySize==0){
            return "";
        }

        char[] msgs = msg.toCharArray();
        char[] keys = key.toCharArray();


        while(i<msgSize && j<keySize){
            anslist.add(msgs[i]);
            i = i + (keys[j]-'0');
            j ++;
        }

        while(i<msgSize){
            anslist.add(msgs[i]);
            i++;
        }

        String ans = "";
        for (char s:anslist) {
            ans += s;
        }
        
        return ans;
    }
}

