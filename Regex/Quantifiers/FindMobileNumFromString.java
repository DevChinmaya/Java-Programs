import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindMobileNumFromString {
    public static void main(String[] args) {
        String exp="[9876][0-9]{9}";
        String s="Game of thrones is an HBO fantasy drama series and 9384873498737"+"ksnjvkhkshdcjh vsjdhvus csjnc 9293873289"+"jeucjkbsdhvb dshh cdhuchne 39844978212798";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}