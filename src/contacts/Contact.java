package src.contacts;

public class Contact {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public String getCompleteInfo(){
        return (firstName + " " + lastName + " " + telephoneNumber);
    }

    public void setContactInfo(String firstName, String lastName, String telephoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        System.out.println("Contact name entered " + this.firstName + " " + this.lastName + "\n telephone: " + this.telephoneNumber);
    }

//    public String removeContact(){
//        this.firstName
//    }

    public static void main(String[] args){
        Contact contact_1 = new Contact();
        contact_1.setContactInfo("Andrew", "Walsh", "210-456-9090");
        Contact contact_2 = new Contact();
        contact_2.setContactInfo("Karla", "Jara", "210-369-3333");


    }
}

