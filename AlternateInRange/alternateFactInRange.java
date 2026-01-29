import java.util.Scanner;
class alternateFactInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to find factorial: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count=0;
        for(int i=n; i<=m; i++){
            int fact=1;
            int j=i;
            while(j>0){
                fact = fact * j;
                j--;    
            }
            count++;
            if(count % 2 != 0){
                System.out.println("Factorial of " + i + ": " + fact);
            }
        }
        sc.close();
    }
}