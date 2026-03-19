public class RemoveVowels {
    public static void main(String[] args) {
        String s="java is easy";
        String result="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' || ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                continue;
            }else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
}