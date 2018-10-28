/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Class Screen that implements ScreenSpec.
 * Called with an overloaded constructor to set
 * resolution, refresh rate, and response time
 *
 ************************************************/

package pack;

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshRate;
  private int responseTime;

  Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }

  @Override
  public String toString() {
    return "Resolution : " + resolution + "\n" +
        "Refresh rate: " + refreshRate + "\n" +
        "Response time: " + responseTime + "\n";
  }
}
