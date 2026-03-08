import java.util.*;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month and year:");
        int month = sc.nextInt();
        int year = sc.nextInt();

        switch(month){
            case 1: 

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12: System.out.println("No of days in this month: 31");
                break;

            case 4: 

            case 6:

            case 9:

            case 11: System.out.println("No of days in this month: 30");

            case 2: 
                if((year%400 == 0) || ((year%4==0)&&(year%100!=0)) ){
                    System.out.println("No of days in this month: 29");
                }else{
                    System.out.println("No of days in this month: 28");
                }
                break;
        }
        sc.close();
    }
}
