/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Sept. 29, 2018
 *
 * Enum class called ItemType to store types Audio, Visual,
 * AudioMobile, and VisualMobile
 *
 ************************************************/

package pack;

public enum ItemType {
  Audio("AU"), Visual("VI"), AudioMobile("AM"), VisualMobile("VM");

  //enum constant
  public final String code;

  /* Constructor is private by default
   *  Allows me to use strings in the parenthesis above
   */
  ItemType(String code) {
    this.code = code;
  }
}
