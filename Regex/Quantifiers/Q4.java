import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4 {
    public static void main(String[] args) {
        String exp="ab+";
        String s="ababbabbba";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find())
            System.out.println(m.group());
            
    }
}
