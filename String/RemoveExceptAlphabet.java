//Remove characters from a string except alphabets
public class RemoveExceptAlphabet {
    public static void main(String[] args) {
        String s="java@123 is easy!#";
        String result="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}