import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
    
        for(int i=1; i<=n; i++){
            //Odd rows
            if(i%2 != 0){
                int k=(n*i)-(n-1);
                for(int j=1; j<=n; j++){
                    System.out.print(k+" ");
                    k++;
                } 
            }else{//Even rows
                int k=n*i;
                for(int j=1; j<=n; j++){
                    System.out.print(k+" ");
                    k--;
                }
                
            }
            System.out.println();
            
        }
    }
}
