/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Sept. 29, 2018
 *
 * Abstract class that implements Item interface.
 * Has methods to set and return the serial number,
 * production number, name, and the date
 * manufactured for the product.
 *
 ************************************************/

package pack;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  // Starting production number at 1
  private static int currentProductionNumber = 1;
  private String manufacturer;
  private int serialNumber;
  private Date manufacturedOn;
  private String name;

  public Product(String name) {
    this.name = name;
    // Setting the serial number to the current production number
    serialNumber = currentProductionNumber;

    //Incrementing currentProductionNumber
    currentProductionNumber++;

    // Setting date to current date
    manufacturedOn = new Date(System.currentTimeMillis());

    manufacturer = Item.manufacturer;
  }

  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  // Setting name for product
  public void setName(String name) {
    this.name = name;
  }

  // Getting product name
  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    Date manuOn = manufacturedOn;
    return manuOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  /*
  overriding toString method so it prints out the manufacturer, serial number, date,
  and name of the product
   */
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number: " + serialNumber + "\n" +
        "Date: " + manufacturedOn + "\n" +
        "Name: " + name + "\n";
  }

  @Override
  public int compareTo(Product p) {
    return name.compareTo(p.getName());
  }
}
