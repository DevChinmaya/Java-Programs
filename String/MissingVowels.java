//Write a java program to print missing vowels in a string?

public class MissingVowels {
    public static void main(String[] args) {
        String s1="aeiouAEIOU";
        String s2= "I LOVE my India";
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(! s2.contains(ch+"")){
                System.out.print(ch);
            }
        }
    }
}

