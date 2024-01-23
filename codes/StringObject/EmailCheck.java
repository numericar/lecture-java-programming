package StringObject;

public class EmailCheck {
    public static void main(String[] args) {
        String correctEmail = "mint.colorfuls@gmail.com";
        String wromgEmail = "ภาษาไทย@gmail.com";

        System.out.println("result of " + correctEmail + " is " + correctEmail.matches("[a-zA-Z0-9._]+@[a-zA-Z]+.com"));
        System.out.println("result of " + wromgEmail + " is " + wromgEmail.matches("[a-zA-Z0-9._]+@[a-zA-Z]+.com"));
    }
}
