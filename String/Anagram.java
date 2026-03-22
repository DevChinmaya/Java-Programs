//Check if two Strings are anagrams of each other
public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(isAnagram(s1, s2));
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        while((s1.length() == s2.length())){
            char ch = s1.charAt(0);
            s1 = s1.replace(ch+"", "");
            s2 = s2.replace(ch+"", "");
            if(s1.length() != s2.length()) return false;
        }
        return true;
    }
    // public static boolean isAnagram(String s1,String s2){
    //     if(s1.length() != s2.length()) return false;
    //     int arr[]=new int[26];
    //     for(int i=0; i<s1.length(); i++){
    //         char ch1=s1.charAt(i);
    //         char ch2=s2.charAt(i);
    //         arr[ch1-'a']++;
    //         arr[ch2-'a']--;
    //     }
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] != 0) return false;
    //     }
    //     return true;
    // }
}
