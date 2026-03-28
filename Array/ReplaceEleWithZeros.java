//Write a program to replace zero with the next nonzero ele and nonzero ele into zero.
//I/P: {0, 2, 0, 4, 0, 3, 5, 6, 7, 0}
//O/P: {2, 0, 4, 0, 3, 0, 0, 0, 0, 5}
import java.util.Arrays;
public class ReplaceEleWithZeros {
    public static void main(String[] args) {
        int a[]={0,2,0,4,0,3,5,6,7,0};
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0) count++;
        }
        int b[] = new int[a.length-count];
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0 && j<b.length){
                b[j] = a[i];
                j++;
            }
        }
        int k=0;
        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
                a[i] = b[k++];
            }else{
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
