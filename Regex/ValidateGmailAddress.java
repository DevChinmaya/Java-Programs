import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateGmailAddress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp="[a-z0-9][a-z0-9.]+@gmail[.]com";
        System.out.println("Enter your mail id:");
        //String s="Aayvak420@gmail.com";
        String s=sc.next();
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        if(m.matches())
            System.out.println("Valid Gmail Address");
        else
            System.out.println("Invalid Gmail Address");
    }
}
