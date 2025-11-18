import java.util.ArrayList;
import java.io.FileNotFoundException;

public interface BackendInterface {
  /*
   * Constructor:
   * IndividualBackendInterface(String csvPath);
   * (this would call the read csv method immediately,
   * which would then function additively to add files to the stored tree
   * 
   * IndividualBackendInterface();
   * this version creates an empty search tree ready to be filled by ReadCsv
   */
  /**
   * Read data from CSV through path name
   * @param path the path name of the data file
   * @throws FileNotFoundException if the data file is not available
   */
  public void ReadCsv(String csvPath) throws FileNotFoundException;
  /**
   * Get a list of cars with minimum mileage
   * @return a list of cars of minimum mileage
   */
  public ArrayList<CarEntry> ListMinimumMilage();
  /**
   * Get a list of cars with mileage at or above a specified limit
   * @param newMileage the specified limit for the mileage
   * @return a list of cars with specified limit in mileage
   */
  public ArrayList<CarEntry> ListAboveThreshold(Integer Bound);
  /**
   * Insert a car into the list of car collection
   * @param Car object that needs to be inserted into the collection
   */
  void insertNewCar(CarEntry Car);
  
}
