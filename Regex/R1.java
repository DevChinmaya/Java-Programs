
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R1 {
    public static void main(String[] args) {
        String exp="aba";
        String s="aababa";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        System.out.println(m.find());
        System.out.println(m.find());
        System.out.println(m.find());
    }
}
