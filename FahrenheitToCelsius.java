import java.util.Scanner;

public class FtoCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets convert fahrenheit to celsius");
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The equivalent temperature in celsius is: " + celsius);
    }
}
