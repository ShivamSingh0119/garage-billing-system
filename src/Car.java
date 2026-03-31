// Car class represents a vehicle with number and model
public class Car {
    private String carNumber;
    private String model;

    // Constructor to initialize car details
    public Car(String carNumber, String model) {
        this.carNumber = carNumber;
        this.model = model;
    }

    // Getter for car number
    public String getCarNumber() {
        return carNumber;
    }

    // Getter for car model
    public String getModel() {
        return model;
    }
}
