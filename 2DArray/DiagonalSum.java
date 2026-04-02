public class DiagonalSum {
    public static void main(String[] args) {
        int a[][]={{1,3,2},{5,7,6},{8,9,4}};
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i][i];
            if(i!=a.length-1-i)
                sum+=a[i][a.length-1-i];

        }
        System.out.println(sum);

    }
    // public static void main(String[] args) {
    //     int a[][]={{1,3,2},{5,7,6},{8,9,4}};
    //     int sum1=0;
    //     int sum2=0;
    //     for(int i=0; i<a.length; i++){
    //         for(int j=0; j<a[i].length; j++){
    //             if(i==j ){
    //                 sum1+=a[i][j];
    //             }if(i+j == 2){
    //                 sum2+=a[i][j];    
    //             }
    //         }
    //     }
    //     System.out.println(sum1);
    //             System.out.println(sum2);

    // }
}
