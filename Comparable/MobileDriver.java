import java.util.Arrays;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile e1=new Mobile("Apple","Pink",100000);
        Mobile e2=new Mobile("Samsung","Red",50000);
        Mobile e3=new Mobile("Oneplus","White",25000);
        Mobile e4=new Mobile("Oppo","Green",20000);
        Mobile e5=new Mobile("Realme","Orange",15000);
        
        Mobile[] e={e1,e2,e3,e4,e5};
        Arrays.sort(e);
        for(Mobile Mobile:e)System.out.println(Mobile);
    }
}
