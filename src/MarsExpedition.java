import java.util.Scanner;
import java.lang.Thread;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("Initializing Mars Expedition Prep Program..");
        Thread.sleep(1000);

        System.out.println("Booting up the Command Center...");
        Thread.sleep(1500);

        System.out.println("Welcome, Mars Expedition Leaders!");
        System.out.println("Preparing for an extraordinary journey...");
        Thread.sleep(2000); // Delay for 2 seconds

        System.out.println("Loading mission objectives and resources...");
        Thread.sleep(1000); // Delay for 1 second

        System.out.println("Performing system checks on communication devices...");
        Thread.sleep(1500); // Delay for 1.5 seconds

        System.out.println("All systems online and ready for launch!");

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. Are you read to head out into the new World ? Type Y or N");

        String answer = input.nextLine();

        if(answer.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people would you like on your team ?");
        int teamNumber = input.nextInt();
        input.nextLine();
        if(teamNumber > 2){
            System.out.println("That's way to many people. We can only send 2 more members.");
            teamNumber = 2;
        } else if (teamNumber < 2){
            System.out.println("You need to have exactly 2 member to go with you.");
            teamNumber = 2;
        } else if (teamNumber == 2){
            System.out.println("Perfect sized team.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring ?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        System.out.println("Choose a vehicle from the list:");
        System.out.println("A. Rover 3000");
        System.out.println("B. Clyde the horse");
        System.out.println("C. Rocket XL");

        System.out.print("Enter the letter of your choice: ");
        char vehicleChoice = input.next().charAt(0);

        String chosenVehicle = "";

        switch (vehicleChoice) {
            case 'A':
                chosenVehicle = "Rover 3000";
                break;
            case 'B':
                chosenVehicle = "Clyde the horse";
                break;
            case 'C':
                chosenVehicle = "Rocket XL";
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(1);
        }

        System.out.println("Preparing for launch...");
        Thread.sleep(2000); // Delay for 2 seconds

        System.out.println("Countdown:");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Delay for 1 second
        }

        System.out.println("Blastoff! Have a fantastic journey to Mars, " + name + "!\n" +
                "Team Size: " + teamNumber + "\n" +
                "Snack: " + snack + "\n" +
                "Vehicle: " + chosenVehicle);



    }
}
