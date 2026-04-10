
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6{
    public static void main(String[] args) {
        String exp="a+b*";
        String s="aababbbaa";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find())
            System.out.println(m.group());
            
    }
}
