import java.util.*;

public class GarageService {
     private Map<String,Customer> customersMap;
     private List<Service> availableService;

    public GarageService( ) {
        this.customersMap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadServices();
    }
    public void loadServices(){
        availableService.add(new Service("Car wash",500));
        availableService.add(new Service("Oil change",700));
        availableService.add(new Service("Wheel alignment",300));
        availableService.add(new Service("Tyre Replacement",500));

    }
    public void addCustomer(String name,String phone,String carNumber,String model){
        Car car = new Car(carNumber,model);
        Customer customer = new Customer(name,phone,car);
         customersMap.put(carNumber,customer);
        System.out.println("Customer added successfully !");

    }
    public void createInvoice(String carNumber)
    {
        if(!customersMap.containsKey(carNumber)){
            System.out.println("No customer Found with car number : " + carNumber);
            return;
        }
        Scanner sc = new Scanner(System.in);
        Customer customer= customersMap.get(carNumber);
        Invoice invoice = new Invoice(0,customer);
        System.out.println("Available Services:");
        for(int i =0;i<availableService.size();i++){
            System.out.println((i + 1) + ". " + availableService.get(i).getName()
                    + " - " + availableService.get(i).getPrice());
        }
        while(true){
            System.out.println("Enter Service Number To Add  or 0 to finish:");
            int choice = sc.nextInt();
            if(choice==0){
                break;
            }
            if(choice>0 && choice <=availableService.size()){
                invoice.addService(availableService.get(choice-1));
                System.out.println("Service Done");
            }
            else{
                System.out.println("Invalid choice");
            }

        }
        invoice.printInvoice();
    }
}
