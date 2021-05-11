package src;

public class Contact {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public String getCompleteInfo(){
        return (firstName + " " + lastName + " " + telephoneNumber);
    }

    public void setFullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Contact name entered " + firstName + " " + lastName);
    }

}

