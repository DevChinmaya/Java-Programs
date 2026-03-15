public class BinToDec {
    public static void main(String[] args) {
        int n = 50;
        int dec=0;
        int i=1;
        while(n>0){
            int d = n%2;
            dec = d*i + dec;
            n /= 2;
            i *= 10;
        }
        System.out.println(dec);
    }
}
