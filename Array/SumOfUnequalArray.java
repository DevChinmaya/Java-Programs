public class SumOfUnequalArray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,3,4,5,6};
        
        for(int i=0; i<a.length; i++){
            b[i] += a[i];
        }
        for(int n:b){
            System.out.print(n+" ");
        }
    }
}
