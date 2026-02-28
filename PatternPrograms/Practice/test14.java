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

/*
Enter the number of rows: 7
1 2 3 4 5 6 7 
14 13 12 11 10 9 8
15 16 17 18 19 20 21
28 27 26 25 24 23 22
29 30 31 32 33 34 35 
42 41 40 39 38 37 36
43 44 45 46 47 48 49
*/