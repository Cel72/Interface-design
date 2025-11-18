import java.util.Scanner;
import java.io.File;

/**
 * This is the interface of a class that will create an interactive loop
 * to search for cars in a date base of cars
 *
 * public interactiveMenu(T backEndObject, Scanner input) {
 *   T back = backEndObject;
 *   Scanner scanner = input;
 * }
 */
public interface FrontendInterface {
  /**
   * this lists all the options for commands that you can use and gives feedback about
   * what the user should enter if it receives an invalid input
   */
  void mainMenu();

  /**
   * Loads the data file of cars that will be used
   */
  void loadFile() ;

  /**
   * Searches the data file and lists the cars with the lowest mileage
   * @return a String of the cars found
   */
  void searchLowestMiles();

  /**
   * Searches the data file and lists the cars with a mileage greater than or equal to the miles
   * sent as an argument
   * @param miles the number of miles that is being searched for the car to be greater
   * than or equal to
   * @return a string of the cars found
   */
  void searchGreaterThanOrEqualTo(int miles);

  /**
   * this command exits the app
   */
  void Exit();
}
/**
 *
 */
