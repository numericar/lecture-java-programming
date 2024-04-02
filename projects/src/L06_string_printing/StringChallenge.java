package L06_string_printing;

public class StringChallenge {
    public static void main(String[] args) {
        String email = "mint.colorfuls@gmail.com";
        System.out.printf("This format gmail is %b\n", isGmail(email));
        System.out.printf("This username is %s\n", getUsername(email));
        System.out.printf("This domain is %s\n", getDomain(email));
        System.out.println("-----------------------------");
        System.out.printf("This binary number is %b\n", isBinary("000000101"));
        System.out.printf("This hex format is %b\n", isHex("0E9F"));
        System.out.printf("This is date format is %b\n", isDate("02/06/2024"));
        System.out.println("-----------------------------");
        System.out.printf("Remove special character %s\n", removeSpecialCharacter(email + "     " + "ez"));
        System.out.printf("Remove extra space %s\n", removeExtraSpaces("Chanokchon     Wongjampa"));
        System.out.printf("Word count is %d\n", findWordCount("   abc   def   ijk   "));

    }

    public static boolean isGmail(String email) {
        return email.matches(".*@gmail.*");
    }

    public static String getUsername(String email) {
        String result = "";

        byte atIndex = (byte) email.indexOf('@');
        if (atIndex >= 0) result = email.substring(0, atIndex);

        return result;
    }

    public static String getDomain(String email) {
        String result = "";

        byte atIndex = (byte) email.indexOf('@');
        byte dotIndex = (byte) email.lastIndexOf('.');
        if (atIndex >= 0) result = email.substring(atIndex + 1, dotIndex);

        return result;
    }

    public static boolean isBinary(String text) {
        return text.matches("[01]+");
    }

    public static boolean isHex(String text) {
        return text.matches("[0-9A-F]*");
    }

    public static boolean isDate(String text) {
        return text.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}");
    }

    public static String removeSpecialCharacter(String text) {
        return text.replaceAll("\\W", "");
    }

    public static String removeExtraSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static int findWordCount(String text) {
        return removeExtraSpaces(text).trim().split("\\s").length;
    }
}
