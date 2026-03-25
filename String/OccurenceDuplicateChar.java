public class OccurenceDuplicateChar {
    public static void main(String[] args) {
        String s = "Javadev";
        boolean flag=true;
        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            String res = s.replace(c+"","");
            int count= s.length()-res.length();
            if(count > 1 ){
                System.out.println(c+"="+count);
                flag=false;
                s = s.replace(c+"","");
            }
        }
        if(flag){
            System.out.println(s);
        }
        
    }
}
