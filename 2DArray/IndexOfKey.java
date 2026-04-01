public class IndexOfKey {
    public static void main(String[] args) {
        int a[][]={{9,1,3},{5,0,7},{8,6,5}};
        int key=5;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(key==a[i][j]){
                    System.out.println("["+i+","+j+"]");
                    return;
                }
            }
        }
    }
}
