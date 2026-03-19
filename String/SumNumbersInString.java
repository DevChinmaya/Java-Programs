public class SumNumbersInString {
    public static void main(String[] args) {
        String s="123an2dje4";
        int sum=0;
        int num=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                num = num*10 + ch-'0';
            }else{
                sum += num;
                num=0;
            }
        }
        System.out.println(sum);
    }
}
