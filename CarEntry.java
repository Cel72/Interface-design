
public interface CarEntry extends Comparable<CarEntry>{
  /*
   * constructor:
   * public CarEntry(String Brand, String Model, Integer Year, Integer Price, Integer Mileage);
   */
  
  //simple functions to obtain properties of the car:
  public String getBrand();
  public String getModel();
  public Integer getYear();
  public Integer getPrice();
  public Integer getMileage();
  
}
