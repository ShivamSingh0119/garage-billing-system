import java.util.*;

// Main service class that handles customers and billing
public class GarageService {
    private Map<String, Customer> customersMap; // stores customers by car number
    private List<Service> availableService;     // list of services

    public GarageService() {
        this.customersMap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadServices();
    }

    // Load default services into system
    public void loadServices(){
        availableService.add(new Service("Car Wash",500));
        availableService.add(new Service("Oil Change",700));
        availableService.add(new Service("Wheel Alignment",300));
        availableService.add(new Service("Tyre Replacement",1000));
    }

    // Add new customer
    public void addCustomer(String name,String phone,String carNumber,String model){
        Car car = new Car(carNumber,model);
        Customer customer = new Customer(name,phone,car);

        customersMap.put(carNumber,customer);
        System.out.println("✅ Customer added successfully!");
    }

    // Create invoice for a customer
    public void createInvoice(String carNumber) {
        if(!customersMap.containsKey(carNumber)){
            System.out.println("❌ No customer found with car number: " + carNumber);
            return;
        }

        Scanner sc = new Scanner(System.in);
        Customer customer = customersMap.get(carNumber);
        Invoice invoice = new Invoice(0,customer);

        System.out.println("\nAvailable Services:");
        for(int i =0;i<availableService.size();i++){
            System.out.println((i + 1) + ". " + availableService.get(i).getName()
                    + " - ₹" + availableService.get(i).getPrice());
        }

        // Loop to select multiple services
        while(true){
            System.out.println("Enter Service Number (0 to finish): ");
            int choice = sc.nextInt();

            if(choice == 0) break;

            if(choice > 0 && choice <= availableService.size()){
                invoice.addService(availableService.get(choice-1));
                System.out.println("✅ Service added");
            } else {
                System.out.println("❌ Invalid choice");
            }
        }

        // Print final bill
        invoice.printInvoice();
    }
}
