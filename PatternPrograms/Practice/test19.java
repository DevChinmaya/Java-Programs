public class test19 {
    public static void main(String[] args) {
        int n=8;
        for(int i=1; i<=2*n-1; i++){
            if(i<=n){
                for(int j=1; j<=n; j++){
                    if(j==n || i==n || i+j == n+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }else{
                for(int j=1; j<=n; j++){
                    if(i-j == n-1 || j==n){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }  
            System.out.println();
        }
    }
}

//         * 
//       * *
//     *   *
//   *     *
// * * * * *
//   *     *
//     *   *
//       * *
//         *