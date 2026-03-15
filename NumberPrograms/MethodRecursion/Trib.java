public class Trib {
    public static void main(String[] args) {
        int n=10;
        //Range(0, n-1);
        int sum=0;
        for(int i=0;i<n; i++){
            System.out.println(trib(i));
            sum += trib(i);
        }
        System.out.println("Sum: " + sum);
    }
    public static void Range(int start,int end){
        if(start > end) return;
        System.out.println(trib(start));
        Range(start+1,end);
    }
    public static int trib(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;   
        return trib(n-1)+trib(n-2)+trib(n-3);
    }
}
