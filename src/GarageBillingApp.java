import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------------Bharti car Service Centre--------------");
            System.out.println("1. Add Customer");
            System.out.println("2. Display Services");
            System.out.println("3. Exit");
            System.out.println("4. Enter Your choice:");

            int choice = sc.nextInt();
            switch (choice){

                case 1:
                    sc.nextLine();
                    System.out.println("Enter Customer Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Phone Number:");
                    String phone = sc.nextLine();
                    System.out.println("Enter Car Number:");
                    String carNum = sc.nextLine();
                    System.out.println("Enter Car Model:");
                    String carMod = sc.nextLine();
                    garageService.addCustomer(name,phone,carNum,carMod);
                    break;
                case 2 :
                    System.out.println("Enter Car Number :");
                    String carNo = sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting ...Thank You");
                    sc.close();;
                    return;
                default:
                    System.out.println("Invalid Choice Try Again:");
            }
        }

    }
}
