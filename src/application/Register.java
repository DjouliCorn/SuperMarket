package application;

public class Register {

    //Blueprint that create an account
    private String firstName;
    private String password;

    //The nickname
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //The password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Register [firstName = " + firstName + ", password =" +
                password + "]";
    }
}
