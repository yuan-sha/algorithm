package goldman;

import java.util.ArrayList;
import java.util.List;

/**
 * Person A and B use an encryption-based system for their conversation.
 *
 * Each conversation message is encrypted from the source and decrypted in the destination
 * using a shared private positive number key known to each other.
 *
 * The algorithm is illustrated with an example.
 *
 * Input format with explanation:
 *
 * Operation (1 for Encryption and 2 for Decryption)
 * Input message
 * Input private key
 * Output format with explanation:
 *
 * Output message
 * Example 1:
 *
 * Input:
 *
 * 1
 * Open
 * 123
 * Output:
 *
 * Oppeeen
 * Here, the input message characters are duplicated based on each digit in the key.
 *
 * Example 2:
 *
 * Input:
 *
 * 2
 * Oppeeen
 * 123
 * Output:
 *
 * Open
 * Here, the input message characters are compressed based on each digit in the key.
 *
 * The conversation message and the private key need NOT be in equal length and the
 * encoding/decoding takes place till the end is reached either conversation message or
 * private key while retaining the rest of the conversation message.
 */
public class EncryAndDecry {
    public static void main(String[] args) {
        System.out.println(encoding("open","123"));
        System.out.println(dencoding("oppeeen","123"));
    }

    private static String encoding(String msg, String key){
        List<Character> ans = new ArrayList<Character>();

        int i = 0; //for msg
        int j=0;//for key

        int keySize = key.length();
        int msgSize = msg.length();

        char[] keys = key.toCharArray();
        char[] msgs = msg.toCharArray();

        if(keySize==0 || msgSize==0){
            return "";
        }

        int count = 0;
        while (j<keySize && i<msgSize){
            count = keys[j] - '0';
            for (int k = 0; k < count; k++) {
                ans.add(msgs[i]);
            }
            j++;
            i++;
        }
        while(i<msgSize){
            ans.add(msgs[i]);
            i++;
        }

        String result = "";
        for (Character c:ans) {
            result += c;
        }
        return result;
    }

    private static String dencoding(String msg, String key){
        List<Character> ans = new ArrayList<Character>();

        int i = 0; //for msg
        int j=0;//for key

        int keySize = key.length();
        int msgSize = msg.length();

        char[] keys = key.toCharArray();
        char[] msgs = msg.toCharArray();

        if(keySize==0 || msgSize==0){
            return "";
        }

        while (j<keySize && i<msgSize){
            ans.add(msgs[i]);
             i = i + (keys[j]-'0');
             j ++;
        }
        while(i<msgSize){
            ans.add(msgs[i]);
            i++;
        }

        String result = "";
        for (Character c:ans) {
            result += c;
        }
        return result;
    }
}
