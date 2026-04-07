//Dot Operator
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R6 {
    public static void main(String[] args) {
        String exp="[.]";
        String s="a.bc.d.e";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        int count=0;
        while(m.find()){
            count++;
            System.out.println(m.group());
        }
        System.out.println(count);
    }
}
