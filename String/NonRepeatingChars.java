//Given a string, print non-repeating characters of the string.
public class NonRepeatingChars {
    public static void main(String[] args) {
        String s = "takeuforward";
        int[] freq=new int[26];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] == 1){
                System.out.print((char)('a'+i)+" ");
            }
        }
    }
}