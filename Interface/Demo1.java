import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT BANK :\n1.HDFC\n2.ICICI\n3.SBI");
        int a = sc.nextInt();

        if(a==1){
            System.out.println("Enter Account Number");
            int b = sc.nextInt();
            if()
        }
        
        
    
    }
}
interface Bank{
    void balance();
    void deposit(int i);
    void withdraw(int j);
    //void addMoney();
    //void substractMoney();
}
class HDFC implements Bank{
    @Override
    public void balance(){
        System.out.println("HDFC Balance check successful");
    }
    @Override
    public void deposit(int i){
        System.out.println("HDFC Deposit amount");
    }
    @Override
    public void withdraw(int j){
        System.out.println("HDFC Withdraw amount");
    }   
}
class SBI implements Bank{
    @Override
    public void balance(){
        System.out.println("Balance check successful");
    }
    @Override
    public void deposit(int i){
        System.out.println("Deposit amount");
    }
    @Override
    public void withdraw(int j){
        System.out.println("Withdraw amount");
    }   
}
