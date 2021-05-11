package src;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App{
    public static void main(String[] args) throws IOException{
        Path dataFile = Paths.get("contacts.txt");
        System.out.println(dataFile);
        System.out.println(Files.exists(dataFile));
        List<String> data = Files.readAllLines(dataFile);
        System.out.println(data);
        
    }
    public static List<Contact> getContacts(){
        Path dataFile = Paths.get("contacts.txt");
        System.out.println(dataFile);
        System.out.println(Files.exists(dataFile));
        List<String> data = Files.readAllLines(dataFile);
        List<Contact> = new List<Contact>;
        System.out.println(data);
        for (String entry : data){
            contacts.add(new Contact())
        }
    }


    // public static void displayContacts(List<Conta)
}
