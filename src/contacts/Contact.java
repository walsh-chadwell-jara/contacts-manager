package contacts;

public class Contact {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public String getCompleteInfo(){
        return ("Contact name: " + firstName + " " + lastName + "\nTelephone number: " + telephoneNumber + "\n");
    }

    public void setContactInfo(String firstName, String lastName, String telephoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        System.out.println("Contact name: " + this.firstName + " " + this.lastName + "\nTelephone number: " + this.telephoneNumber + "\n");
    }

    public String getName()

//    public String removeContact(){
//        this.firstName
//    }

    public static void main(String[] args){
        Contact contact_1 = new Contact();
        contact_1.setContactInfo("Andrew", "Walsh", "210-456-9090");
        Contact contact_2 = new Contact();
        contact_2.setContactInfo("Karla", "Jara", "210-369-3333");
        Contact contact_3 = new Contact();
        contact_3.setContactInfo("Jake", "Chadwell", "210-4460-4040");


    }
}

