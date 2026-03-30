import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1,7,3,5,12,2,7,5,1,6,9,11,12};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a){
        for(int i=0; i<a.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
