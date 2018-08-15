package Q345;

public class ReverseVowelsString {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = ("a|e|i|o|u|A|E|I|O|U");
        for(int i=0, j= s.length()-1; i<j;i ++, j--)
        {
            while(i<s.length() && vowels.indexOf(s.charAt(i))==-1) {
                i++;
            }
            System.out.println(s.charAt(j));
            while(j>0 && vowels.indexOf(s.charAt(j))==-1) {
                j--;
            }
            if(i<j)
            {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));

            }
        }
        return sb.toString();
    }
}
