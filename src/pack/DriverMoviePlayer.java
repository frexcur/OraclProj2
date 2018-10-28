/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Test class for the MoviePlayer to make sure
 * we can instantiate it
 *
 ************************************************/

package pack;

public class DriverMoviePlayer {

  public static void main(String[] args) {
    MoviePlayer m1 = new MoviePlayer("iPod Mini", new Screen("1366x768", 40, 22), MonitorType.LCD);
    System.out.println(m1.toString());
  }
}
