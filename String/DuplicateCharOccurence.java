public class DuplicateCharOccurence {
    public static void main(String[] args) {
        String s="Hello World";
        char ch[] = s.toCharArray();
        String res="";
        for(int i=0; i<s.length(); i++){
            int num=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) != '\u0000' && s.charAt(j) !='\u0000'){
                    if(s.charAt(i) == s.charAt(j)){
                        num++;
                        ch[i] = (char) (1+'0');
                        ch[j] = (char) (num+'0');
                        s = s.replace(s.charAt(j), '\u0000');
                    }
                }
            }
            // if(count == 1){
            //     ch[i] = s.charAt(i);
            // }
        }
        System.out.println(ch);
    }
}
