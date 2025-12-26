import java.util.Scanner;
public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    String car_type;
    int car_price;
    String car_transmission;

    public void get_details(){
        System.out.println("CAR NAME:"+car_name);
        System.out.println("CAR COLOR:"+car_color);
        System.out.println("CAR FUEL TYPE:"+car_fuel_type);
        System.out.println("CAR TYPE:"+car_type);
        System.out.println("CAR PRICE:"+car_price);
        System.out.println("CAR TRANSMISSON:"+car_transmission);
    }
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("========================ENETR CAR DETAILS=====================");
        System.out.println();
        System.out.println("CAR NAME:");
        car_name=sc.nextLine();
        System.out.println("CAR COLOR:");
        car_color=sc.nextLine();
        System.out.println("CAR FUEL TYPE:");
        car_fuel_type=sc.nextLine();
        System.out.println("CAR TYPE:");
        car_type=sc.nextLine();
        System.out.println("CAR PRICE:");
        car_price=sc.nextInt(); 
        System.out.println("CAR TRANSMISSION:");
        car_transmission=sc.nextLine();
        total_car_in_stocks++;
    
    }
}
