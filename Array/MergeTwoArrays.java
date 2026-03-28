import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]a={1,3,4,5};
        int[]b={2,4,3,1};
        int[]c=new int[a.length+b.length];
        int idx=0;
        for(int i=0; i<c.length; i++){
            if(i<a.length){
                c[i] = a[i];
            }else{
                c[i] = b[idx++];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
