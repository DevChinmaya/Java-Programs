
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q2 {
    public static void main(String[] args) {
        String exp="ab{1,}";
        String s="ababbabbb";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}