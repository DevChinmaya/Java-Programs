import java.util.Scanner;

public class decToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = sc.nextInt();
        String bin="";
        while(n>0){
            int r = n % 2;
            bin = r+bin;
            n /= 2;
        }
        System.out.println(bin);
    }
    
}
