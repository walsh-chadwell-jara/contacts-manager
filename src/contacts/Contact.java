package contacts;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getFullName(){
        return (firstName + " " + lastName);
    }
    
    public static void main(String[] args){
        Contact contact_1 = new Contact();
        contact_1.setContactInfo("Andrew", "Walsh", "210-456-9090");
        Contact contact_2 = new Contact();
        contact_2.setContactInfo("Karla", "Jara", "210-369-3333");
        Contact contact_3 = new Contact();
        contact_3.setContactInfo("Jake", "Chadwell", "210-4460-4040");




    }
}

