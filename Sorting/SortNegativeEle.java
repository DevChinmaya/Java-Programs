import java.util.*;
public class SortNegativeEle {

    public static void main(String[] args) {
        int[] a = {-1,0,-7,-3,-4,-2,0,0};
        int[] b=new int[a.length];
        Arrays.sort(a);
        int count=0;
        for(int i=0; i<a.length; i++){
            b[count++]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
    // public static void main(String[] args) {
    //     int[] a = {-1,0,-7,-3,-4,-2,0,0};
    //     sort(a);
    //     System.out.println(Arrays.toString(a));
    // }
    // public static void sort(int[]a){
    //     for(int i=0; i<a.length-1; i++){
    //         int maxIndex=i;
    //         for(int j=i+1; j<a.length; j++){
    //             if(a[j] > a[maxIndex]){
    //                 maxIndex=j;
    //             }
    //         }
    //         int temp=a[i];
    //         a[i] = a[maxIndex];
    //         a[maxIndex] = temp;
    //     }
    // }
