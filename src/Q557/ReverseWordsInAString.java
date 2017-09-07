package Q557;

/**
 * Created by Mark on 2017/7/2.
 */
public class ReverseWordsInAString {
    public static void main(String args[]){
        String output = "Let's take LeetCode contest";
        ReverseWordsInAString r = new ReverseWordsInAString();
        System.out.println(r.reverseWords(output));
    }
    public String reverseWords(String s) {
        StringBuffer buf = new StringBuffer();
        String[] splited = s.split(" ");
        for(String line : splited) {
            buf.append(new StringBuilder(line).reverse().toString() + " ");
        }
        return buf.toString().trim();
    }

}
