// Replace the vowels with '_' if vowels count is greater than 3?
public class ReplaceVowels {
    public static void main(String[] args) {
        String s="java is easy";
        String s1="";
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        if(count>=3){
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    s1 += "_";
                }else{
                    s1 += ch;
                }
            }
            System.out.println(s1);
        }else{
            System.out.println(s);
        }    
    }
}
