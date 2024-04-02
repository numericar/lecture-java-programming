package L07_condition_statement;

public class PracticeSwitch {
    public static void main(String[] args) {
        int number = 8;

        switch (number) {
            case 5:
                System.out.println("Successful");
                break;
            case 6:
                System.out.println("Success");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
