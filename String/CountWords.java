//Write a program to count the number of words in a string. (without using split method)
public class CountWords {
    public static void main(String[] args) {
        String s="   java   is    easy   ";
        int count=0;
        for(int i=0; i<s.length()-1; i++){
            char ch=s.charAt(i);
            char next=s.charAt(i+1);

            if(ch==' ' && next != ' '){
                count++;
            }
        }
        if(s.charAt(0)==' '){
            System.out.println(count);
        }else{
            System.out.println(count+1);
        }
    }
}

