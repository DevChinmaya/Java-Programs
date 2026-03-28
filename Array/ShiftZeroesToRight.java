
import java.util.Arrays;
public class ShiftZeroesToRight {
    public static void main(String[] args) {
        int a[] = {0,2,0,4,0,3,9,6,0,7,0,8,0};
        int b[] = new int[a.length];
        
        int n=0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                b[n] = a[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
