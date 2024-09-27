import java.util.Scanner;

public class Sumof2Nos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int Num1= input.nextInt();
        System.out.print("Now, enter the second number: ");
        int Num2= input.nextInt();
        int sum = Num1 + Num2;
        System.out.println("The sum of both the numbers is: " + sum );

        //or

        System.out.print("\nThe sum of both the numbers is: " + (Num1 + Num2));
    }
}
