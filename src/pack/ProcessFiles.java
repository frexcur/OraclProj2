/***********************************************
 * Author: Freiddy Curiel
 *
 * Date: Dec. 5, 2018
 *
 * This class will store the results of the test
 * from the EmployeeInfo class. It will save both
 * the employee information and the product
 * tested in a text file.
 *
 ************************************************/
package pack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {

  //Path files
  private Path p, p2, p3;

  public ProcessFiles(EmployeeInfo e, ArrayList<Product> pr) {
    p = Paths.get("C:/Users/Freiddy/LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
    try {
      WriteFile(e);
      WriteFile(pr);
    } catch (IOException e1) {
      e1.printStackTrace();
    }
  }

  private void CreateDirectory() {
    if (Files.notExists(p)) {
      try {
        Files.createDirectories(p);
        System.out.println("Directory Created");
      } catch (IOException e) {
        System.out.println("Can't Create Directory");
      }
    }
  }

  /**
   * @param employee info
   * @throws IOException - thrown if file can't be written
   */
  public void WriteFile(EmployeeInfo employee) throws IOException {

    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.println(employee.toString());

    printWriter.close();
  }

  /**
   * @param products Arraylist
   * @throws IOException if file can't be written to
   */
  public void WriteFile(ArrayList<Product> products) throws IOException {

    File file = new File(p3.toString());
    Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.println(products.toString());

    printWriter.close();
  }
}
