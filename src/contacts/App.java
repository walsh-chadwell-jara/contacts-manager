package src.contacts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args) throws IOException{
        System.out.println(Files.exists(Paths.get("src/contacts/data/contacts.txt")));
        List<Contact> contacts = getContacts();
        displayContacts(contacts);
    }
    //PRINTS ONE CONTACT IN TERMINAL
    public static void displayContact(Contact contact){
        System.out.printf("%s %s | %s%n", contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber());
    }
    //PRINTS ALL OF THE CONTACTS IN THE TERMINAL
    public static void displayContacts(List<Contact> contacts){
        System.out.println("Name | Phone Number\n------------");
        for (Contact contact : contacts){
            displayContact(contact);
        }
    }
    //GETS THE LIST OF CONTACTS FROM THE TEXT FILE
    public static List<Contact> getContacts() throws IOException{
        Path dataFile = Paths.get("src/contacts/data/contacts.txt");
        List<String> data = Files.readAllLines(dataFile);
        List<Contact> contacts = new ArrayList<Contact>();
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
                break;
            }
        } 
    }

}