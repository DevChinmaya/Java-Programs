import java.util.*;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Onum = 1;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                for(int j=1; j<=i; j++){
                    System.out.print(Onum+" ");
                    Onum++;
                }
            }else{
                int Enum = Onum+i-1;
                for(int j=1; j<=i; j++){
                    System.out.print(Enum+" ");
                    Enum--;
                }
                Onum = Onum+i;
            }
            System.out.println();
        }
    }
}
