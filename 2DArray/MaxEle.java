public class MaxEle {
    public static void main(String[] args) {
        int a[][]={{1,-2,3},{4,-5,6},{7,8,9}};
        int max=Integer.MIN_VALUE;
        for(int n[]:a){
            for(int m:n){
                if(m>max) max=m;
            }
        }
        System.out.println(max);
    }
}
