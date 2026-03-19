//Write a program to print sum of digits in a string.
public class test1{
    public static void main(String[] args) {
        String s="Ram123";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i)<='9'){
                sum+=s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}