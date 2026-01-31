public class decToBin {
    public static void main(String[] args) {
        int n = 100011;
        int prod = 1;
        int dec = 0;
        while(n > 0){
            int d = n%10;
            dec +=  prod*d;
            prod*=2;
            n/=10;
        }
        System.out.println(dec);
    }
}
