// Write a program to find the contigious elements whose sum is equal to key
// I/P: {2,1,3,2,4,1,2,1} , key=8
// O/P: [2 1 3 2] 
//      [4 1 2 1]
public class ContigousEleSum {
    public static void main(String[] args) {
        int a[]={2,1,3,2,4,1,2,1};
        int key=8;
        for(int i=0; i<a.length; i++){
            int sum=0;
            int res[]=new int[a.length];
            for(int j=i; j<a.length; j++){
                res[j] = a[j];
                sum += res[j];
                if(sum == key){
                    for(int k=0; k<res.length; k++){
                        if(res[k] != 0){
                            System.out.print(res[k]+" ");
                        }
                    }
                    //System.out.println(Arrays.toString(res));
                    System.out.println();
                }
            }
        }
    }
}
