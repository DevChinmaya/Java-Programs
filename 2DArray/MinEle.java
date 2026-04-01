
public class MinEle {
    public static void main(String[] args) {
        int a[][]={{1,-2,3},{4,-5,6},{7,8,9}};
        int min=Integer.MAX_VALUE;
        for(int n[]:a){
            for(int m:n){
                if(m<min) min=m;
            }
        }
        System.out.println(min);
    }
}
