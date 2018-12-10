/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Oct. 27, 2018
 *
 * Audio player class to give details of
 * what our audio player can do
 *
 ************************************************/

package pack;

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * @param name - entered product name
   * @param audioSpecification - the type of audio
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.Audio;
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
        "Audio Spec: " + audioSpecification + "\n" +
        "Type: " + mediaType + "\n";
  }
}
