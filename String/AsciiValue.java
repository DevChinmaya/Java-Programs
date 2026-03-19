public class AsciiValue {
    public static void main(String[] args) {
        String s="java";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            int ascii=ch;
            System.out.println(ch+" : "+ascii);
        }
    }
}
