package contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App{
    public static void main(String[] args) throws IOException{
        System.out.println(Files.exists(Paths.get("src/contacts/data/contacts.txt")));
        List<Contact> contacts = getContacts();
        displayContacts(contacts);
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do{
            options();
            userInput = scanner.nextInt();
            if(userInput == 1){
                displayContacts(contacts);
            }else if(userInput == 2){
                System.out.println("Enter First Name, Last Name, and Number: ");
                String userFirstName = scanner.next();
                String userLastName = scanner.next();
                String userNumber = scanner.next();
                addContact(userFirstName, userLastName, userNumber);
            }else if(userInput == 3){
                System.out.println("Enter a full name: ");
                String userFullName = scanner.nextLine();
                searchContact(userFullName, contacts);
            }else if(userInput == 4){
                System.out.println("Enter a full name of the contact you would like to delete: ");
                String userFullName = scanner.nextLine();
                deleteContact(userFullName, contacts);
            }else if(userInput == 5){
                System.out.println("Have a nice day!");
                break;
            }
            System.out.println("Continue? [y/n]");
            String continueInput = scanner.next();
            if(continueInput.equalsIgnoreCase("y")){
                continue;
            }else{
                System.out.println("Okay, have a good day!");
                break;
            }
        }while(true);
    }
    //PRINTS ONE CONTACT IN TERMINAL
    public static void displayContact(Contact contact){
        System.out.printf("%-8s %-8s | %-16s%n \n", contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber());
    }
    //PRINTS ALL OF THE CONTACTS IN THE TERMINAL
    public static void displayContacts(List<Contact> contacts){
        System.out.println("      Name        | Phone Number\n---------------------------------");
        for (Contact contact : contacts){
            displayContact(contact);
        }

    }
    //GETS THE LIST OF CONTACTS FROM THE TEXT FILE
    public static List<Contact> getContacts() throws IOException{
        Path dataFile = Paths.get("src/contacts/data/contacts.txt");
        List<String> data = Files.readAllLines(dataFile);
        List<Contact> contacts = new ArrayList<>();
        System.out.println(data);
        for (String entry : data){
            contacts.add(new Contact());
        }
        return contacts;
    }
    //FINDS THE CONTACT IN THE LIST OF CONTACTS BY NAME
    public static void searchContact(String fullName, List<Contact> contacts){
        for (Contact contact : contacts){
            if (contact.getFullName().equals(fullName)){
                System.out.println("We found the contact:");
                displayContact(contact);
                break;
            }
        }
    }
    //DELETES A CONTACT FROM THE LIST
    public static void deleteContact(String fullName, List<Contact> contacts){
        for (Contact contact : contacts){
            if (contact.getFullName().equals(fullName)){
                contacts.remove(contact);
                System.out.println("This contact has been removed:");
                displayContact(contact);
            }
        } 
    }

    //ADDS A NEW CONTACT TO THE LIST
    public static void addContact(String firstName, String lastName, String phoneNumber) throws IOException {
        Files.write(Paths.get("src/contacts/data/contacts.txt"), Collections.singletonList(firstName + " " + lastName + " " + phoneNumber), StandardOpenOption.APPEND);
        System.out.println("Contact successfully added!");
    }

    //OPTIONS FOR USER TO CHOOSE FROM
    public static void options(){
        System.out.println("What would you like to do?");
        System.out.println("--------------------------");
        System.out.println("1 - View contacts");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Search a contact by name");
        System.out.println("4 - Delete an existing contact");
        System.out.println("5 - Exit");
        System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
    }

}