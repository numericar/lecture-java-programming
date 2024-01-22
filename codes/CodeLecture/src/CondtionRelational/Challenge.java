package CondtionRelational;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isYoung(47));
        System.out.println(getGrade(62));

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
}
