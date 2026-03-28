//Find common ele from 2 arrays
//I/P: a={1,3,4,5,2}, b={2,4,3,1,6}
//O/P: 1 3 4 2 
public class FindCommonEle {
    public static void main(String[] args) {
        int[] a={1,7,3,4,5,2};
        int[] b={2,4,3,1,6};
        int n = a.length>b.length ? b.length : a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
