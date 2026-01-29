import java.util.*;
public class snakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%2 != 0){//odd rows

                int k = (n*i) - (n-1);
                for(int j=1; j<=n; j++){
                    System.out.print(k+ "\t");
                    k++;
                }
            }else{//for even rows
                int k = n*i;
                for(int j=1; j<=n; j++){
                    System.out.print(k+ "\t");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
