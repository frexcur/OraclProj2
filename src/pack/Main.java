/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Dec 11, 2018
 *
 * Main method of this console based program.
 * Users will be able to create products,
 * view the amount of products created, and
 * view the type of products created.
 *
 ************************************************/
package pack;


import java.util.Collections;
import pack.ItemType;
import pack.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  static Scanner scan = new Scanner(System.in, "UTF-8");
  static ArrayList<Product> products = new ArrayList<>();
  static boolean start = true;
  static String name;
  static int choice;

  public static void main(String args[]) {

    System.out.println("Hello, welcome to the Oracle Production program!\n");

    /**
     * While loop will print out to the user to enter a number between 1 - 3 to start the program.
     * And will then grab the next int entered to run the appropriate function and/or print
     * statement to the user. If any exception is thrown it will tell the user they need to enter
     * a number.
     */
    while (start) {
      System.out.println("To create a product, enter 1.");
      System.out.println("To view the amount of products made, enter 2.");
      System.out.println("To view the type of products made, enter 3.");
      System.out.println("To exit the program, enter any other number");
      try {
        choice = scan.nextInt();
        switch (choice) {
          case 1:
            AddProduct();
            break;
          case 2:
            //display total products made
            System.out.println("\nYou have created " + products.size() + " products so far!");
            break;
          case 3:
            //display types of products made
            DriverCollections.print(products);
            break;
          default:
            start = false;
        }
      } catch (Exception e) {
        System.out.println("Please enter a number");
        scan.nextLine();
      }
    }
  }

  private static void AddProduct() {
    System.out.println("Enter product name");
    name = scan.next();
    System.out.println(
        "Your product name will be: " + name + ".");
    System.out.println("To make a movie player, enter 1");
    System.out.println("To make a audio player, enter 2");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        // Creates movie player with the name they entered
        CreateMoviePlayer(name);
        break;
      case 2:
        // Creates audio player with the name they entered
        CreateAudioPlayer(name);
        break;
      default:
        System.out.println("Please enter 1 or 2");
    }
  }

  private static void CreateAudioPlayer(String name) {
    String audioSpec;
    System.out.print("Please the type of audio you will be using (MP3,WAV, etc.): ");
    audioSpec = scan.next();

    AudioPlayer audio = new AudioPlayer(name, audioSpec);
    products.add(audio);

    System.out.println("\nCongratulations, audio player was successfully made!");
    System.out.println();
  }

  private static void CreateMoviePlayer(String name) {
    boolean valid = true;
    String screenResolution, monitorType;
    int refreshRate = 0, responseTime = 0;
    System.out.print("Enter the screen resolution (ex. 1080x720): ");
    screenResolution = scan.next();
    while (valid) {
      try {
        System.out.print("\nEnter the refresh rate: ");
        refreshRate = scan.nextInt();
        valid = false;
      } catch (Exception e) {
        System.out.println("\nInvalid input. Please enter a number for the refresh rate\n");
        scan.nextLine();
      }
    }
    valid = true;
    while (valid) {
      try {
        System.out.print("Enter the response time: ");
        responseTime = scan.nextInt();
        valid = false;
      } catch (Exception e) {
        System.out.println("\nInvalid input. Please enter a number for the response time\n");
        scan.nextLine();
      }
    }

    System.out.print("Is the monitor LED or LCD? ");
    monitorType = scan.next();

    switch (monitorType.toUpperCase()) {
      case "LED":
        MoviePlayer movie = new MoviePlayer(name,
            new Screen(screenResolution, refreshRate, responseTime), MonitorType.LED);
        products.add(movie);
        break;
      case "LCD":
        MoviePlayer m1 = new MoviePlayer(name,
            new Screen(screenResolution, refreshRate, responseTime), MonitorType.LCD);
        products.add(m1);
        break;
      default:
        System.out.println("Something went wrong");
    }
    System.out.println("\nCongratulations, movie player was successfully made!");
    System.out.println();
  }
}
