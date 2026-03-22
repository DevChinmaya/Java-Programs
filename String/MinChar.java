public class MinChar {
    public static void main(String[] args) {
        String s = "jaaaava";
        char ch=s.charAt(0);

        for(int i=0; i<s.length(); i++){
            int count=1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) ==  s.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch + ": "+ count);
                break;
            }
        }
        
    }
}
