
/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Testing to see if we can instantiate
 * the Screen class
 *
 ************************************************/
package pack;

public class DriverScreen {

  public static void main(String[] args) {
    Screen screen = new Screen("1080 x 720", 144, 1);

    System.out.println(screen);
  }

}
