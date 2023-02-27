import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year + ".");// здесь выводится результат в формате дд.мм.гггг.
        } else {
            System.out.println("13.09." + year + ".");
        }
    }

    public static boolean isLeapYear(int year) { // здесь определяется, является ли переданный год високосным
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0){
            return false;
        } else return year % 4 == 0;
    }
}
