public class DuplicateEle {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,1,4,2,6,7};
        for(int i=0; i<a.length; i++){
            int count=1;
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]) {
                    count++;
                    a[j] = 0;
                }
            }
            if(count != 1 && a[i]!= 0) System.out.print(a[i]+" ");
        }
    }
}
