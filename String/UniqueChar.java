public class UniqueChar {
    public static void main(String[] args) {
        String s="Ramana";
        char ch[] = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            
            if(ch[i] == '\u0000')continue;
            int count=1;
            for(int j=i+1; j<s.length(); j++){
            
                if(ch[i] == ch[j]){
                    ch[j] = '\u0000';
                    count++;
                }
            }
            if(ch[i] != '\u0000'  && count==1){
                System.out.print(ch[i]+" ");
            }
            ch[i] = '\u0000';
        }
    }
}
