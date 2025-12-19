//SwitchCases.java

import java.util.Scanner;

public class SwitchCases{

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        boolean keepGoing = true;

        System.out.println("Starting type 1 loop...");

        while(keepGoing){
            System.out.print("Enter 1, 2, 3, or 4: ");
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    System.out.println("You chose 1");
                    break;
                case "2":
                    System.out.println("You chose 2");
                    break;
                case "3":
                    System.out.println("You chose 3");
                    break;
                case "4":
                    System.out.println("You chose 4");
                    break;
                case "69", "420":
                        System.out.println("Very Funny...");
                        break;
                default:
                    System.out.println("Terminating instance...");
                    keepGoing = false;
            }//end switch
        }//end while

        System.out.println("\nStarting type 2 loop...");

        keepGoing = true;
        while(keepGoing){
            System.out.print("Enter 1, 2, 3, or 4: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1" -> System.out.println("You chose 1");
                case "2" -> System.out.println("You chose 2");
                case "3" -> System.out.println("You chose 3");
                case "4" -> System.out.println("You chose 4");
                case "69", "420" -> System.out.println("Very Funny...");
                default -> { System.out.println("Terminating instance"); keepGoing = false; }
            }//end switch
        }//end while

    }//end main

/*
If you want to loop use a boolean variable
    In this case it is KeepGoing



*/

}//end class