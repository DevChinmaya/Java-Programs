
public class RemoveDuplicateEle {

    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,3,4,4,4,5,7,6};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]) {
                    a[j] = 0;
                }
            }
            if(a[i]!=0) System.out.print(a[i]+" ");
        }
    }
}
