package OOPs;

/**
 * Access_Modifiers
 * 
 * Encapsulation 
Encapsulation is the process of combining data and functions into a single unit called class. 
In Encapsulation, the data is not accessed directly; 
it is accessed through the functions present inside the class. 
In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. 
Thus, encapsulation makes the concept of data hiding possible.
(Data hiding: a language feature to restrict access to members of an object, 
reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java). 


 */


class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getPassword(){  //getters
        return this.password;
    }

    public void setPassword(String pass){  //setters
        this.password = pass;
    }

}
public class Access_Modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Utsav";
        a1.setPassword("aforapple");
        a1.getPassword();
        System.out.println(a1.getPassword());

    }
    
}