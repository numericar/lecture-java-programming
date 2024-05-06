package L07_condition_statement;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isYoung(47));
        System.out.println(getGrade(62));
        getRedix("00001011");
        isLeapYear(2040);
    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static boolean isYoung(int age) {
        return (age >= 14) && (age <= 55);
    }

    public static char getGrade(int score) {
        char grade;

        if (score >= 70) {
            grade = 'A';
        } else if (score >= 60) {
            grade = 'B';
        } else if (score >= 50) {
            grade = 'C';
        } else if (score >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void getRedix(String number) {

        if (number.matches("[01]+")) {
            System.out.println("Binary radix = 2");
        } else if (number.matches("[0-7]+")) {
            System.out.println("Octor radix = 8");
        } else if (number.matches("[0-9]+")) {
            System.out.println("Decimal radix = 10");
        } else if (number.matches("[0-9A-F]+")) {
            System.out.println("Hexa radix = 16");
        } else {
            System.out.println("Not a number");
        }
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It's a leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("It's a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
