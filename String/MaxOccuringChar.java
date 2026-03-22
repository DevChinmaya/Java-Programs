//Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them.
//Input: str = “takeuforward”
//Output: a

public class MaxOccuringChar {
    public static void main(String[] args) {
        String s="takeuforward";
        System.out.println(maxChar(s));
        
    }
    public static char maxChar(String s){
        int freq[] = new int[26];
        int max=Integer.MIN_VALUE;
        char maxCh=' ';
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            if(max<freq[ch-'a']){
                max = freq[ch-'a'];
                maxCh = ch;
            }
        }
        return maxCh;
    }
    //Using Hashmap
    // public static char maxChar(String s){
    //     Map<Character,Integer> hs = new HashMap<>();
    //     int max=Integer.MIN_VALUE;
    //     char maxCh=' ';
    //     for(int i=0; i<s.length(); i++){
    //         hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i), 0)+1);
    //     }
    //     for(Map.Entry<Character,Integer> entry: hs.entrySet()){
    //         if(entry.getValue() > max){
    //             max = entry.getValue();
    //             maxCh = entry.getKey();
    //         }
    //     }
    //     return maxCh;
    // }
    
}
