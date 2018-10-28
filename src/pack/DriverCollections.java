/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Testing our collections method and also
 * print method
 *
 ************************************************/


package pack;

import java.util.ArrayList;

public class DriverCollections {


  //Creating testCollection method
  static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    //A new ArrayList to hold the products made above
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  //Using a stream to go through every item in an ArrayList and print it out
  static void print(ArrayList<Product> a1) {
    a1.stream()
        .forEach(System.out::println);
  }
}
