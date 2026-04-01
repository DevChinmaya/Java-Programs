
import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {
        int a[][]={{9,1,3},{5,0,7},{8,6,5}};
        int b[][]={{6,4,2},{1,3,4},{8,1,3}};
        int c[][]=new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                c[i][j]=a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));
    }
}
