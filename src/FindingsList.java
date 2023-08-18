import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class FindingsList {
    public FindingsList() throws InterruptedException{
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition!");

        //create a string list to store the rocks
        ArrayList<String> rocks = new ArrayList<String>();
        //add the items to the list
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println("Your finding were downloaded!");

        System.out.println(rocks);

        System.out.println("Oh wait. There is a not rock on the list. I will need to remove it");

        //remove an item from the list
        rocks.remove("not rock");

        System.out.println("Perfect. Here is your updated list: " + rocks);

        Thread.sleep(1000);

        // Create a HashMap to store fossil data
        Map<String, String> fossilMap = new HashMap<>();

        // Add fossils and their descriptions to the HashMap
        fossilMap.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilMap.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilMap.put("Tooth Fossil", "The tooth from an unknown fossil");

        // Print a message
        System.out.println("Fossil data downloaded");

        // ask the user for each fossil he would like to learn about
        System.out.println("Which of the fossils would you like to learn more about it ? (Spelling and Spacing is important)?");
        System.out.println(fossilMap);
       // get the user input
        Scanner input = new Scanner(System.in);

        //save the user answers in a variable
        String fossilChoice = input.nextLine();

        if(fossilChoice.equalsIgnoreCase("Bird Fossil"))
        {
            System.out.println("Fossil " + fossilChoice + "\nDescription: " + fossilMap.get(fossilChoice));
        } else if(fossilChoice.equalsIgnoreCase("Fish Fossil"))
        {
            System.out.println("Fossil " + fossilChoice + "\nDescription: " + fossilMap.get(fossilChoice));
        } else if(fossilChoice.equalsIgnoreCase("Tooth Fossil"))
        {
            System.out.println("Fossil " + fossilChoice + "\nDescription: " + fossilMap.get(fossilChoice));
        }

        Thread.sleep(700);

        // Create an empty HashSet to store special supplies
        HashSet<String> suppliesSet = new HashSet<>();

        // Add super important items to the HashSet
        suppliesSet.add("GPS Tracker");
        suppliesSet.add("Emergency First Aid Kit");
        suppliesSet.add("Satellite Phone");

        // Print the contents of the set before the expedition
        System.out.println("Supplies Before Expedition: " + suppliesSet);

        //remove a item from the hashset
        suppliesSet.remove("Gps Tracker");
        System.out.println("Supplies After Expedition: " + suppliesSet);


    }



}
