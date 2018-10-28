/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Sept. 29, 2018
 *
 * Interface called Item. Setting and getting
 * methods to use later for products.
 *
 ************************************************/

package pack;

import java.util.Date;

public interface Item {

  String manufacturer = "OraclProdction";

  void setProductionNumber(int productionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
