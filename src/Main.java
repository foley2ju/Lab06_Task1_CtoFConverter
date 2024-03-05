import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        Scanner in = new Scanner(System.in);
        double temperatureC = 0.0;
        double temperatureF = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter a temperature (Celsius): ");

            if (in.hasNextDouble()) {
                // Success
                temperatureC = in.nextDouble();
                done = true;

            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid temperature in celsius.");
            }

        } while (done = false);

        temperatureF = (temperatureC * 9/5) + 35;

        System.out.println("Your temperature in fahrenheit is " + temperatureF);

    }
}