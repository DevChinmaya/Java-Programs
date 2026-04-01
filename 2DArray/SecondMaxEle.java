public class SecondMaxEle {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int n[]:a){
            for(int m:n){
                if(m>max){
                    smax=max;
                    max=m;
                }
                else if(m>smax && m!=max){
                    smax=m;
                }
            }
        }
        System.out.println(smax);
    }
}