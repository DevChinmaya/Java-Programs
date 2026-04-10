import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R7 {
    public static void main(String[] args) {
        String exp="[^0-9a-zA-Z]";
        String s="@$ab2c4n5m7Btu#";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
