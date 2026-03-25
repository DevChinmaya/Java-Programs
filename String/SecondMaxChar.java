public class SecondMaxChar {
    public static void main(String[] args) {
        String s1 = "aaabbbcc";
        char maxCh1=' ';
        char maxCh2=' ';
        int maxCnt1=0;
        int maxCnt2=0;
        while(s1.length()>0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"","");
            int count=s1.length()-s2.length();
            if(count > maxCnt1){
                maxCh2 = maxCh1;
                maxCnt2 = maxCnt1;
                maxCh1 = ch;
                maxCnt1= count;
            }else if(count > maxCnt2 && count != maxCnt1){
                maxCnt2 = count;
                maxCh2 = ch;
            }
            s1 = s2;
        }
        System.out.println(maxCh1 +"="+ maxCnt1);
        System.out.println(maxCh2 +"="+ maxCnt2);

    }
}
