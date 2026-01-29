import java.util.Scanner;

class hcfandlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd=1;
        if(n>m){
            for(int i=1; i<=m; i++){
                if(n % i == 0 && m % i == 0) {   
                    gcd = i;
                }
            }
        }else{
            for(int i=1; i<=n; i++){
                if(n % i == 0 && m % i == 0) {   
                    gcd = i;
                }
            }
        }
        
        int lcm = (n*m)/gcd;
        System.out.println("Gcd of n and m is "+gcd);
        System.out.println("Lcm of n & m is "+lcm);
    }
}
