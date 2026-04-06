import java.util.Arrays;
import java.util.Scanner;
public class MobileDriver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mobile m1=new Mobile("Iphone","Space Black",150000,12,1024);
        Mobile m2=new Mobile("Samsung","White",125000,16,256);
        Mobile m3=new Mobile("Oppo","Pink",20000,8,128);
        Mobile m4=new Mobile("Realme","Orange",22000,12,128);
        Mobile m5=new Mobile("Google","Obsedian",70000,12,512);

        // System.out.print("Enter number of products u want to add:");
        // Mobile m[]=new Mobile[sc.nextInt()];
        // System.out.println("Enter in this following order: name->color->price->ram->rom \n");
        // for(int i=0; i<m.length; i++){
        //     m[i]=new Mobile(sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
        //     System.out.println("---------------------------");
        // }
        // for(Mobile z:m) System.out.println(z);

        Mobile m[]={m1,m2,m3,m4,m5};

        System.out.println("Select options according to which you want to sort.");
        System.out.println("1. Sort by color \n" 
                         +"2. Sort by name \n"
                         +"3. Sort by ram \n"
                         +"4. Sort by rom \n"
                         +"5. Sort price low to high \n"
                         +"6. Sort by price high to low \n"
                         +"7. Exit");
        while (true) { 
            int n=sc.nextInt();
            switch(n){
                case 1:{
                    Arrays.sort(m,new SortByColor());
                    System.out.println("Sorted according to color");
                    for(Mobile mob:m) System.out.println(mob);
                } 
                break;
                case 2:{
                    Arrays.sort(m,new SortByName());
                    System.out.println("Sorted according to name");
                    for(Mobile mob:m) System.out.println(mob);
                } 
                break;
                case 3:{
                    Arrays.sort(m,new SortByRam());
                    System.out.println("Sorted according to ram");
                    for(Mobile mob:m) System.out.println(mob);
                } 
                break;
                case 4:{
                    Arrays.sort(m,new SortByRom());
                    System.out.println("Sorted according to rom");
                    for(Mobile mob:m) System.out.println(mob);
                } 
                break;
                case 5:{
                    Arrays.sort(m,new SortByPriceLowToHigh());
                    System.out.println("Sorted according to price low to high");
                    for(Mobile mob:m) System.out.println(mob);
                } 
                break;
                case 6:{
                    Arrays.sort(m,new SortByPriceHighToLow());
                    System.out.println("Sorted according to price high to low");
                    for(Mobile mob:m) System.out.println(mob);
                } 
                break;
                case 7:{
                    System.out.println("Thanks for coming!");
                    return;
                }
            }
        }  
    }
}
