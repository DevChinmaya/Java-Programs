//Given a String remove all the duplicate characters from the given String.
// Input: s = "bcabc"
// Output: "bca" 
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "bacabbacd";
        System.out.println(rmvDupli(s));
        
    }
    public static String rmvDupli(String s){
        boolean seen[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!seen[ch-'a']){
                seen[ch-'a']=true;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String rmvDupli(String s){
        StringBuilder sb =  new StringBuilder();
        for(int i=0; i<s.length(); i++){
            boolean found=false;
            for(int j=0; j<sb.length(); j++){
                if(s.charAt(i) == sb.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
