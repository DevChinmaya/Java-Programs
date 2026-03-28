public class LinearSearch {
    public static void main(String[] args) {
        int [] a = {10,5,23,55,9};
        System.out.println(search(a,23));
    }
    public static int search(int[] a,int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key) return i;
        }
        return -1;
    }
}
