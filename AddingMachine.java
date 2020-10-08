
/**
* The AddingMachine program performs addition and subtraction operations
* and prints the results.
*
* @author  Kyle Otstot
* @version 2.0
* @since   2020-10-07
*/

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String text;

  /**
   * This is the constuctor method of AddingMachine. Included for clarity.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    text = "0 ";
  }

  /**
   * This accessor method returns the 'total' attribute
   * @return int This returns the 'total' attribute.
   */
  public int getTotal () {
    return total;
  }

  /**
   * This method adds the input to the total
   * @param value This is added to 'total'
   * @return Nothing.
   */
  public void add (int value) {
    total += value;
    text += "+ " + value + " ";
  }

  /**
   * This method subtracts the input from the total
   * @param value This is subtracted from 'total'
   * @return Nothing.
   */
  public void subtract (int value) {
    total -= value;
    text += "- " + value + " ";
  }

  /**
   * This method prints the history of transactions
   * @return String This returns the transactions performed.
   */
  public String toString () {
    return text;
  }

  /**
   * This method clears the operation and resets 'total' to 0.
   */
  public void clear() {
    total = 0;
    text = "0 ";
  }

  /**
   * This is the main method which makes use of AddingMachine.
   * @param args Unused.
   * @return Nothing.
   */
  public static void main(String[] args)
  {
    AddingMachine myCalculator = new AddingMachine();
    myCalculator.add (4);
    myCalculator.subtract (2);
    myCalculator.add(5);
    System.out.println(myCalculator);
  }
}
