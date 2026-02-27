public class test6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n+1; j++){
                if((i==0 && j%3 !=0) || (i==1 && j%3 == 0) || (i+j == n+3 || i-j == n-3)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
  * *   * *   
*     *     *
*           *
  *       *
    *   *
      *
*/
