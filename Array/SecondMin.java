
public class SecondMin {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,8,-1,-3,-5,9};
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                smin=min;
                min=a[i];
            }else if(a[i] < smin && a[i] != min){
                smin = a[i];
            }
        }
        System.out.println(smin);
    }
}
