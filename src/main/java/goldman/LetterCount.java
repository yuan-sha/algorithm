package goldman;

/**
 * if(s.charAt(x) != s.charAt(x + 1) && count == 1) print the counter and character
 *
 * if ( s.charAt(x)== s.charAt(x + 1) ==> Increase the counter
 *
 * if ( s.charAt(x) != s.charAt(x + 1) && count >= 2) ==> reset to counter 1.
 */
public class LetterCount {
    public static void main(String[] args) {
        String s = "aabbcccdddf";
        String result = "";
        int count = 1;
        int i;
        for ( i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=s.charAt(i+1)&&count==1){
                result += s.charAt(i);
                result += count;
            }else if(s.charAt(i)==s.charAt(i+1)){
                count ++;
            }else if(s.charAt(i)!=s.charAt(i+1)&&count>=2){
                result += s.charAt(i);
                result += count;
                count = 1;
            }
        }
        result += s.charAt(i);
        result += count;
        System.out.println(result);
    }
}

