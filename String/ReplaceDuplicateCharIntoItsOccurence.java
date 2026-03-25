//Write a java program to replace the duplicate characters into their occurence
// I/P: Hello World
// O/P: He121 W2r3d
public class ReplaceDuplicateCharIntoItsOccurence {
    public static void main(String[] args) {
        String s = "Hello Worlld";
        char ch[] = s.toCharArray();                  
        for (int i = 0; i < ch.length; i++) {
            int num = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] != '\u0000' && ch[i] == ch[j]) {
                    num++;
                    ch[j] = (char) (num + '0'); 
                }
            }
            if (num > 1) {
                ch[i] = '1'; 
            }
        }
        System.out.println(ch);
        // String s="Hello World";
        // char ch[] = s.toCharArray();
        // String res="";
        // for(int i=0; i<s.length(); i++){
        //     int num=1;
        //     for(int j=i+1; j<s.length(); j++){
        //         if(s.charAt(i) != '\u0000' && s.charAt(j) !='\u0000'){
        //             if(s.charAt(i) == s.charAt(j)){
        //                 num++;
        //                 ch[i] = (char) (1+'0');
        //                 ch[j] = (char) (num+'0');
        //                 s = s.replace(s.charAt(j), '\u0000');
        //             }
        //         }
        //     }
        // }
        // System.out.println(ch);
    }
}

