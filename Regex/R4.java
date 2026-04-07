//Dot Operator
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R4 {
    public static void main(String[] args) {
        String exp="[ab]";
        String s="abcdafg";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
