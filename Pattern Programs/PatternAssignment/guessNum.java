import java.util.*;

public class guessNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.next();
        int r = (int)(Math.random()*9)+1;
        int score=0;
        
        for(int i=1; i<=3; i++){
            System.out.println("Guess a number between (1-9): ");
            int n = sc.nextInt();
            if(r == n){
                score += 10;
                r=(int)(Math.random()*9)+1;
            }
        }
        System.out.println("Your score is: "+score);
    }
}
