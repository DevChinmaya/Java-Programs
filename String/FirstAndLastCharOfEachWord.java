// Given a string, write a program to capitalize the first and last character of each word of that string.
// Input:"take u forward is awesome"
// Output: “TakE U ForwarD IS AwesomE”

public class FirstAndLastCharOfEachWord {
    public static void main(String[] args) {
         String s="  take u forward is awesome  ";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if((i==0 && ch!=' ') || ch==' ' || s.charAt(i-1) == ' '){
                System.out.print(Character.toUpperCase(ch));
            }else if((i==s.length()-1 && ch!=' ') || ch==' ' || s.charAt(i+1) == ' '){
                System.out.print(Character.toUpperCase(ch));
            }else{
                System.out.print(ch);
            }
        }
    }
}