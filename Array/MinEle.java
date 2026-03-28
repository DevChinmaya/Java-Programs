public class MinEle {
    public static void main(String[] args) {
        int a[]={9,3,2,5,-6,-1,0};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
