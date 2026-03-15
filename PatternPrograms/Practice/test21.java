import java.util.*;
public class test21 {

    

                /*
                    1
                    3  2
                    4  5  6
                    10 9  8  7
                    11 12 13 14 15
                    21 20 19 18 17 16
               
               */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        int sp=n-1;
        int st=1;
            /*
                  1
                 121
                12321
               1234321
           */
        for(int i=1; i<=n; i++){
            int d=0;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=st; k++){
                if(k<=(st/2)+1){
                    d++;
                }
                else d--;
                System.out.print(d);
            } 
            sp--;
            st+=2;
            System.out.println();
        }
    }


    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no of rows: ");
    //     int n = sc.nextInt();
    //     int sp=0;
    //     int st=n;
    //     for(int i=1; i<=2*n; i++){
    //         for(int j=1; j<=st; j++){
    //             System.out.print("* ");
    //         }
    //         for(int j=1; j<=sp; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=st; j++){
    //             System.out.print("* ");
    //         }
    //         if(i<=n){
    //             st--;
    //             sp+=2;  
    //         }else{
    //             st++;
    //             sp-=2;
    //         }
            
    //         System.out.println();
    //     }
    // }



    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no of rows: ");
    //     int n = sc.nextInt();
    //     int sp=n/2;
    //     int st=1;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=sp; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=st; j++){
    //             if(j==1 || j==st){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
                
    //         }
    //         if(i<(n/2)+1){
    //             sp--;
    //             st+=2;
    //         }else{
    //             sp++;
    //             st-=2;
    //         }
    //         System.out.println();
    //     }
    //}




    //HOLLOW REVERSE PYRAMID
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no of rows: ");
    //     int n = sc.nextInt();
    //     int sp=0;
    //     int st=(2*n)-1;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=sp; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=st; j++){
    //             if(i==1 || j==1 || j==st){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
                
    //         }
    //         sp++;
    //         st-=2;
    //         System.out.println();
    //     }
    // }

    //HOLLOW PYRAMID
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no of rows: ");
    //     int n = sc.nextInt();
    //     int sp=n-1;
    //     int st=1;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=sp; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=st; j++){
    //             if(j==1 || j==st || i==n){
    //                 System.out.print("* ");
    //             }else{
    //                 System.out.print("  ");
    //             }
                
    //         }
    //         sp--;
    //         st+=2;
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no of rows: ");
    //     int n = sc.nextInt();
    //     int d=2;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(d);
    //         }
    //         d+=2;
    //         System.out.println();
    //     }
    // }


    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no of rows: ");
    //     int n = sc.nextInt();
    //     int sp=0;
    //     int st=n;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=st; j++){
    //             System.out.print("* ");
    //         }
    //         st--;
    //         System.out.println();
    //     }
    // }
}
