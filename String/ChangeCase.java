//Write a java program to convert uppercase chars to lowercase and lowercase chars to uppercase
public class ChangeCase {
    public static void main(String[] args) {
        String s="Venkat RamaNa";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                System.out.print((char)(ch+32));
            }else if(ch >='a' && ch<='z'){
                System.out.print((char)(ch-32));
            }else{
                System.out.print(ch);
            }
        }
    }
}
