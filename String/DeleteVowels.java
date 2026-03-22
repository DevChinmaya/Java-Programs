public class DeleteVowels {
    public static void main(String[] args) {
        String s = "India";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' 
               || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                continue;
            }else{
                System.out.print(ch);
            }
        }
    }
}




















    // public static void main(String[] args) {
    //     String s = "India";
    //     char c[] = s.toCharArray(); 
    //     for(int i=0; i<c.length; i++){
    //         char ch = c[i];
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
    //             c[i] = '\u0000';
    //         }
    //         if(c[i] != '\u0000'){
    //             System.out.print(c[i]);
    //         }
    //     }
       
    // }

