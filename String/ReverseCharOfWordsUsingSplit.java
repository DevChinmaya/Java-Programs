//Reverse the chars of words of a string?
//I/P: java is easy
//O/P: avaj si ysae
public class ReverseCharOfWordsUsingSplit {
    public static void main(String[] args) {
        String s="java is easy";
        String res="";
        String str[]=s.split(" ");
        for(int i=0; i<str.length; i++){
            res += reverse(str[i]+" ");
        }
        System.out.println(res.trim());
    }
    public static String reverse(String s){
        String res="";
        for(int i=s.length()-1; i>=0; i--){
            res += s.charAt(i);
        }
        return res;
    }
}
