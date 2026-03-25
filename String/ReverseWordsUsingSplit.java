//Reverse the words of a string by using split method?
// I/P: java is easy 
// O/P: easy is java
public class ReverseWordsUsingSplit {
    public static void main(String[] args) {
        String s = "java is easy";
        String str[] = s.split(" ");
        for(int i=str.length-1; i>=0; i--){
            System.out.println(str[i]+" ");
        }
    }
}
