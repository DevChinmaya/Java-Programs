
public class BinarySearch {
    public static void main(String[] args) {
        int [] a = {10,5,23,55,9};
        System.out.println(search(a,23));
    }
    public static int search(int[] a,int key){
        int st=0;
        int end=a.length-1;
        while(st <= end){
            int mid=(st+end)/2;
            if(key == a[mid]) return mid;
            else if(key < a[mid]) end=mid-1;
            else st = mid+1;
        }
        return -1;
    }
}
