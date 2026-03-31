import java.util.ArrayList;
import java.util.List;

// Invoice class handles billing logic
public class Invoice {
    private Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    // Constructor initializes invoice with customer
    public Invoice(double totalAmount, Customer customer) {
        this.totalAmount = 0;
        this.serviceList = new ArrayList<>();
        this.customer = customer;
    }

    // Add selected service to invoice
    public void addService(Service service){
        serviceList.add(service);
        totalAmount += service.getPrice();
    }

    // Print final bill
    public void printInvoice(){
        System.out.println("\n========== INVOICE ==========");
        System.out.println("Customer : " + customer.getName() + " | Phone: " + customer.getPhone());
        System.out.println("Car : " + customer.getCar().getModel() + " | Number : " + customer.getCar().getCarNumber());

        System.out.println("\nServices Availed:");
        for(Service service : serviceList){
            System.out.println("- " + service.getName() + " : ₹" + service.getPrice());
        }

        System.out.println("\nTotal Amount : ₹" + totalAmount);
        System.out.println("=============================");
        System.out.println("      Thank You Visit Again   ");
    }
}
