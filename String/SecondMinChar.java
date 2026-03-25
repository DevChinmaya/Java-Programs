public class SecondMinChar {
    public static void main(String[] args) {
        String s1 = "abbbbccccddd";
        char minCh1=' ';
        char minCh2=' ';
        int minCnt1=s1.length();
        int minCnt2=s1.length();
        while(s1.length()>0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if(count < minCnt1 ){
                minCh2 = minCh1;
                minCnt2 = minCnt1;
                minCh1 = ch;
                minCnt1 = count;
            }
            else if(count < minCnt2 && count > minCnt1 ){
                minCh2 = ch;
                minCnt2 = count;
            }
            s1=s2;
        }
        System.out.println(minCh1 +"="+minCnt1);
        System.out.println(minCh2 +"="+minCnt2);
    }
}
