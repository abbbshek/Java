import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int P = input.nextInt();
        System.out.print("Enter the tenure in years: ");
        int T = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double R = input.nextDouble();

        double simpleInterest = (P * R * T * 0.01);
        System.out.println("The simple interes t is: " + simpleInterest + " Rs");
    }
}
