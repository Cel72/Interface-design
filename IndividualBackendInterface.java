import java.io.FileNotFoundException;

public interface IndividualBackendInterface {
    /**
     * Read data file through path name
     * @param path the path name of the data file
     * @throws FileNotFoundException if the data file is not available
     */
    void readFile(String path) throws FileNotFoundException;
    /**
     * Get a list of cars with minimum mileage
     * @return a list of cars of minimum mileage
     */
    Iterable<CarInterface> getMinMileage();

    /**
     * Get a list of cars with mileage at or above a specified limit
     * @param newMileage the specified limit for the mileage
     * @return a list of cars with specified limit in mileage
     */
    Iterable<CarInterface> getSpecifiedMileage(int newMileage);
    /**
     * Insert a car into the list of car collection
     * @param Car object that needs to be inserted into the collection
     * @return True if the insertion is successful, false if unsuccessful
     */
    boolean insertNewCar(CarInterface Car);


    /**
     * Constructors for implementation
     * Backend();
     * Backend(String path);
     */

}
