//Program to count vowels, consonant, digits and special characters in string.
public class CountChars {
    public static void main(String[] args) {
        String s="java is easy 1234 @#$%";
        int vowel=0, consonent=0, digit=0, special=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                vowel++;
            }else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                consonent++;
            }else if (ch>='0' && ch<='9') {
                digit++;
            }else {
                special++;
            }
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonent);
        System.out.println("Digits: "+digit);
        System.out.println("Special Characters: "+special);
    }
}
