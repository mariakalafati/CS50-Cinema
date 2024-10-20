import java.io.*;
import java.util.Date;

public class Hall1{

    private String number;

    public Hall1(String hallnumber){
    // Constructor
        number = hallnumber;
    }

    // Global variables //
        private static int id;
        private static int line;
        private static int spl;
        private static boolean threeD;
        private static double price;


        public static String[][] Avail1;
        public static String[][] Avail2;

        private static String apogevma_titlos;
        private static String apogevma_time;

        private static String vradi_titlos;
        private static String vradi_time;


    public static void initialise(){
        id = 1;
        line = 2;
        spl = 5;
        threeD = true;
        if(threeD){
            price = 10.5;
        }else{
            price = 7.0;
        }

        Avail1 = new String[line][spl];
        Avail2 = new String[line][spl];

        apogevma_titlos = "Mulan";
        apogevma_time = "15:00";

        for(int i = 0; i < line; i++){
            for( int j = 0; j < spl; j++){
                Avail1[i][j] = "A";
            }
        }

        //System.out.print("\nHall [id = "+ id +", ThreeD = "+ threeD+", movie = "+ apogevma_titlos+ ", time = " + apogevma_time+ ", price = "+ price+"]");

        vradi_titlos = "Snow";
        vradi_time = "19:30";

        for(int i = 0; i < line; i++){
            for( int j = 0; j < spl; j++){
                Avail2[i][j] = "A";
            }
        }
    }

    public static void printHall(){
        System.out.print("\nHall [id = "+ id +", ThreeD = "+ threeD+", movie = "+ apogevma_titlos+ ", time = " + apogevma_time+ ", price = "+ price+"]");

        for(int i = 0; i < line; i++){
            System.out.print("\nLine "+ (i+1)+ "    " );
            for( int j = 0; j < spl; j++){
                System.out.print("  "+Avail1[i][j]+ "  |");
            }
        }

         System.out.print("\n\nHall [id = "+ id +", ThreeD = "+ threeD+", movie = "+ vradi_titlos+ ", time = " + vradi_time+ ", price = "+ price+"]");

        for(int i = 0; i < line; i++){
            System.out.print("\nLine "+ (i+1)+ "    " );
            for( int j = 0; j < spl; j++){
                System.out.print("  "+Avail2[i][j]+ "  |");
            }
        }
    }

    public static void book (int choice, int l, int s){
        Date date=java.util.Calendar.getInstance().getTime();
        if(choice == 1){
            if(Avail1[l][s] == "A"){
                System.out.println("Ticket [id = "+ id +", price = "+ price+", hall = "+ id+", movie = "+ apogevma_titlos+ ", time = " + apogevma_time+" date = "+date+", line = "+l+", seat = "+s+"]");
                Avail1[l][s] = "X";
            }else{
                System.out.println("Sorry, this seat is taken.");
            }
        }else if(choice == 2 ){
            if(Avail1[l][s] == "A"){
                System.out.println("Ticket [id = "+ id +", price = "+ price+", hall = "+ id+", movie = "+ vradi_titlos+ ", time = " + vradi_time+" date = "+date+", line = "+l+", seat = "+s+"]");
                Avail2[l][s] = "X";
            }else{
                System.out.println("Sorry, this seat is taken.");
            }
        }
    }
}