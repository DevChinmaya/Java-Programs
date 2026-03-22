public class MaxChar {
    public static void main(String[] args) {
        String s="jaaava";
        char ch = ' ';
        int maxCount=1;
        
        for(int i=0; i<s.length(); i++){
            int count=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
                if(maxCount < count){
                    maxCount=count;
                    ch = s.charAt(i);
                }
            }
        }
        System.out.println(ch + ": "+maxCount);
    }
}
