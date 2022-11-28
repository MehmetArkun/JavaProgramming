package week13;

public class Credentials {

    public String email = "oscar@cydeo.com";
    private String userName = "Scolfield"; // encapsulated fields
    private String passWord = "Cydeo123";

    public String getUserName(String emailInput){
        if(emailInput.equalsIgnoreCase(email)){
            return this.userName;
        }
        return "condition has NOT been satisfied";

    }
}
