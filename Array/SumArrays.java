public class SumArrays {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[3];
        for(int i=0; i<a.length; i++){
            c[i] = a[i]+b[i];
            System.out.print(c[i]+" ");
        }
    }
}
