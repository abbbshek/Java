import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LEAP YEAR FINDER");
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");
        }
    }
}
