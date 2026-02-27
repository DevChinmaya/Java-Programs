public class BinToDec {
    public static void main(String[] args) {
        int n=35;
        int bin=0;
        int prod=1;
        while(n>0){
            int d=n%2;
            bin += d*prod;
            prod *= 10;
            n/=2;
        }
        System.out.println(bin);
    }
}
