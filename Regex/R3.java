
//Dot Operator
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R3 {
    public static void main(String[] args) {
        String exp="a..";
        String s="aabcdafghij";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
