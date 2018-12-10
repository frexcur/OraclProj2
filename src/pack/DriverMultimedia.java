/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Test class to make sure both the AudioPlayer
 * and MoviePlayer can use the
 * Multimedia controls
 *
 ************************************************/

package pack;

public class DriverMultimedia {

  public static void main(String[] args) {

    AudioPlayer a1 = new AudioPlayer("hi", "AU");

    a1.play();

    MoviePlayer m1 = new MoviePlayer("hi", new Screen("1080", 60, 1), MonitorType.LCD);

    m1.play();
  }
}
