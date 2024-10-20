import java.util.Scanner;

public class Customer{

    public static String cinema_name = "Pallas";
	public static int num_halls = 2 ;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Hall1 hall1 = new Hall1("hall1");
        hall1.initialise();

        Hall2 hall2 = new Hall2("hall2");
        hall2.initialise();

        System.out.println("***** Welcome to Cinema " + Hall.cinema_name + " ***** ");
        int option;
        do{
            System.out.println("\nPress 1 for availability");
            System.out.print("Press 2 to book : ");
            option = input.nextInt();

            if(option == 1){
                hall1.printHall();
                hall2.printHall();
            }else if(option == 2){
                System.out.print("\nChoose Hall? [ 1 to "+Hall.num_halls+" ] : ");
                int hall = input.nextInt();
                System.out.print("Projection, 1 for evening 2 for night : ");
                int choice = input.nextInt();
                System.out.print("Line :  ");
                int l = input.nextInt();
                System.out.print("Seat :  ");
                int s = input.nextInt();

                if(hall == 1){
                    hall1.book(choice,l-1,s-1);
                }else if (hall == 2){
                    hall2.book(choice,l-1,s-1);
                }
            }
        }while(option == 1 || option == 2);

    }
}