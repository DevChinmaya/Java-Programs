import java.util.Scanner;

class OptimalHcf {
    public static int findHCF(int a, int b){
        while(a>0 && b>0){
            if(a>=b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a==0 ? b : a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf=findHCF(a,b);
        System.out.println("HCF of two numbers is: "+hcf);
    }
}
