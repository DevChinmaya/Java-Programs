
import java.util.Scanner;
public class RedBus{
    public static void main(String[] args) {
        Reservation p1 = new Reservation();
        p1.reserveSeats();

        Reservation p2 = new Reservation();
        p2.reserveSeats();

    }
}
class Bus{
    private static Bus n;
    private int totalSeats;
    private Bus(){
        totalSeats=50;
    }
    public static Bus getObject(){
        if(n==null){
            n=new Bus();
        }
        return n;
    }
    public void seatBooking(int seats){
        System.out.println("TOtal seats are available");
    }
}
class Reservation {
    public void reserveSeats(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many seats needed to book");
        int noOfSeats=sc.nextInt();

        Reservation b = Reservation.getObject();
        b.seatBooking(noOfSeats);
    }
    public static void main(String[] args) {
       
    }
}