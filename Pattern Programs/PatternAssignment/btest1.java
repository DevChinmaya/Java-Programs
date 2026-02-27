class btest1{
    public static void main(String[] args){
        int n = 5;
        //first half
        for (int i = 1; i < n; i++){
            //st
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //sp
            for (int j = 1; j <= 2 * (n - i) - 1; j++){
                System.out.print(" ");
            }
            //st
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Middle row
        for(int i=1; i<=2*n-1; i++){
            System.out.print("*");
        }
        System.out.println();
        //last half
        int sp=1;
        for(int i=1; i<n; i++){
            //st
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            //sp
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            sp += 2;
            //st
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
/*

*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *

 */