/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Setting up our movie player class. Like the
 * audio player, the movie player will implement
 * the MultimediaControl interface. It will also
 * have to fields for the screen and monitor
 * type.
 *
 ************************************************/

package pack;

public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  /**
   * @param name of the product
   * @param screen is the screen resolution, refresh rate, and response time
   * @param monitorType - whether its lcd or led
   */
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.monitorType = monitorType;
    this.screen = screen;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopped");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return super.toString() +
        "Monitor Type: " + monitorType + '\n' +
        "Screen " + screen.toString() + '\n';
  }
}
