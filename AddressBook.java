package Day9;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contacts>list = new ArrayList<Contacts>();
    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete contact. ");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {  //Choice the condition
                case 1:
                    System.out.println("Enter Contact Details");
                    System.out.println("Enter firstname");
                    String firstName = sc.next();
                    System.out.println("Enter lastname");
                    String lastName = sc.next();
                    System.out.println("Enter address");
                    String address = sc.next();
                    System.out.println("Enter city");
                    String city = sc.next();
                    System.out.println("Enter state");
                    String state = sc.next();
                    System.out.println("Enter zip");
                    int zip = sc.nextInt();
                    System.out.println("Enter mobile number");
                    long mobNum = sc.nextLong();
                    System.out.println("Enter email-Id");
                    String emailId = sc.next();
                    AddressBook contact1 = new AddressBook();
                    contact1.addContact(firstName, lastName, address, city, state, zip, mobNum, emailId);
                    break;
                case 2:
                    System.out.println("Edit Contact");
                    break;
                case 3:
                    System.out.println("Delete Contact");
                    break;
                default:
                    System.out.println("Enter valid Number");
            }
            System.out.println("Program ended..Thank You");
        }
    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long mobNum, String emailId) {
        Contacts person = new Contacts(firstName, lastName, address, city, state, zip, mobNum, emailId);
        list.add(person);
        person.display();
    }
}
