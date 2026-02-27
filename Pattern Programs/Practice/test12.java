import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        char ch='A';
        int sp=n-1;
        int st=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=st; j++){
                if(j==1 || i==n || j==st){
                    System.out.print(ch+" ");
                    ch++;
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
            sp--;
            st+=2;
        }
    }
}

/*
Enter the number of rows: 7
            A 
          B   C
        D       E
      F           G 
    H               I
  J                   K
L M N O P Q R S T U V W X
*/
