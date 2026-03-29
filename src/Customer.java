public class Customer {
    private String name;
    private String phone;
    private Car car;

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public Car getCar() {
        return car;
    }
    public Customer(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;

    }
}
