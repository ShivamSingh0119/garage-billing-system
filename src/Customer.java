// Customer class stores customer details along with their car
public class Customer {
    private String name;
    private String phone;
    private Car car;

    // Constructor to initialize customer details
    public Customer(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Car getCar() {
        return car;
    }
}
