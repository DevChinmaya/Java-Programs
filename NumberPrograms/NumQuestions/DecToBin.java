public class DecToBin {
    public static void main(String[] args) {
        int n=110010;
        int bin=0;
        int prod=1;
        while(n>0){
            int d=n%10;
            bin = d*prod + bin;
            prod *= 2;
            n/=10;
        }
        System.out.println(bin);
    }
}
