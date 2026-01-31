import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int num=1;
        for(int i=1; i<=n; i++){
            //Odd rows
            if(i%2 != 0){
                
                for(int j=1; j<=i; j++){
                    System.out.print(num+" ");
                    num++;
                } 
            }else{//Even rows
                int num2=num+i-1;
                for(int j=1; j<=i; j++){
                    System.out.print(num2+" ");
                    num2--;
                }
                num=num+i;
                
            }
            System.out.println();
            
        }
    }
}

// 1 
// 3 2
// 4 5 6
// 10 9 8 7
// 11 12 13 14 15