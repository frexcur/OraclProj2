/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Dec. 5, 2018
 *
 * Class is made to keep track of which employee
 * runs test of the production line. It does so
 * by creating a user ID from their full name.
 * If the name entered is not valid they will be
 * given a default guest value
 *
 ************************************************/

package pack;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in = new Scanner(System.in, "UTF-8");

  public EmployeeInfo() {
    setName();
    p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setDeptId();
    in.close();
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  // Creates employee code if a valid name is entered, else they are given guest
  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { //If valid
      code = name.substring(0, 1) + name.substring(name.indexOf(" ") + 1);
    } else { //If invalid
      code = "guest";
    }
  }

  /**
   * @return name of Employee
   */
  private String inputName() {
    String nameString;
    System.out.println("Please enter your first and last name");
    nameString = in.nextLine();
    return nameString;
  }

  // Method returns true if the name is valid, false if invalid
  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * @return deptID of employee
   */
  public String getDeptId() {
    System.out.println("Please enter a Dept ID");
    deptId = in.nextLine();
    if (!validId(deptId)) {
      deptId = "None01";
    }
    return deptId;
  }

  public void setDeptId() {
    getDeptId();
  }

  private String getId() {
    return null;
  }

  private boolean validId(String id) {
    if (p.matcher(id).matches()) {
      deptId = reverseString(id);
      return true;
    } else {
      return false;
    }
  }

  /**
   * @param id of employee
   * @return Department ID
   */
  public String reverseString(String id) {
    deptId = "";
    for (int i = id.length() - 1; i >= 0; i--) {
      deptId = deptId + id.charAt(i);
    }
    return deptId;
  }

  // Overwritten toString method to return employee code and department number
  @Override
  public String toString() {
    return "Employee Code : " + code + "\n" + "Department Number : " + deptId;
  }
}
