//Dot Operator
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R5 {
    public static void main(String[] args) {
        String exp="[ab].";
        String s="adbcaabccdbe";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
