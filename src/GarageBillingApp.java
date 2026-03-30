import java.util.Scanner;

/**
 * Main class to run Garage Billing System
 * This class handles user interaction using menu-driven approach
 */
public class GarageBillingApp {

    public static void main(String[] args) {

        // Creating object of service layer (business logic)
        GarageService garageService = new GarageService();

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to keep application running
        while (true) {

            // Display menu options
            System.out.println("-------------- Bharti Car Service Centre --------------");
            System.out.println("1. Add Customer");
            System.out.println("2. Generate Invoice");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer

                    // Taking customer details
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Car Number: ");
                    String carNum = sc.nextLine();

                    System.out.print("Enter Car Model: ");
                    String carMod = sc.nextLine();

                    // Calling service method to add customer
                    garageService.addCustomer(name, phone, carNum, carMod);
                    break;

                case 2:
                    // Generating invoice for existing customer
                    System.out.print("Enter Car Number: ");
                    String carNo = sc.next();

                    garageService.createInvoice(carNo);
                    break;

                case 3:
                    // Exit the application
                    System.out.println("Exiting... Thank You!");
                    sc.close();
                    return;

                default:
                    // Handling invalid input
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
