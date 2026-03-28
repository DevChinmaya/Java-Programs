public class FindMissingEle {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,7,8};
        int lastEle=a[a.length-1];
        int nSum=lastEle*(lastEle+1)/2;
        int sum=0;
        for(int i=0;i<a.length; i++){
            sum+=a[i];
        }
        System.out.println(nSum - sum);
    }
}
