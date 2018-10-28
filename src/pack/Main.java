/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Sept. 29, 2018
 *
 * Main method of program
 *
 ************************************************/
package pack;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    ArrayList products = new ArrayList<>();

    products.addAll(DriverCollections.testCollection());
    Collections.sort(products);
    DriverCollections.print(products);

  }

}
