public class ReverseString {
    public static void main(String[] args) {
        String s="java is easy";
        String result="";
        for(int i=s.length()-1; i>=0; i--){
            char ch=s.charAt(i);
            result+=ch;
        }
        System.out.println(result);
    }
}
