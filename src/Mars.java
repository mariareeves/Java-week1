import java.io.*;
import java.lang.Thread;
public class Mars {
    public static void main(String[]args){
        String colonyName = "Reevesland";
        int  shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(10);

        //everyone eats 0.75 meals per day
        // it takes 2 days to land
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);

        System.out.println(meals);

        meals += meals * .5;

        shipPopulation += 5;

        String landingLocation = "The Ocean";

//        check if landingLocation is equal to "The Plain"
//        if its then print "Bzzz landing on the Plain"
//        else print “ERROR!!! Flight plan already set. Landing on the Plain”
        if(landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bzzz landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
    }

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute < minutesLeft; minute++) {
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e){
                //Handle the exception
                e.printStackTrace();
            }
        }
        System.out.println("Landed");
        return false;
    }

}
