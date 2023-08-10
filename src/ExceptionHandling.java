import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // This might throw an InputMismatchException

            if (num == 0) {
                throw new CustomException("Custom Exception: Cannot divide by zero.");
            }

            int result = divideByTwo(num); // This might throw a CustomException
            System.out.println("Result after dividing by 2: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }

        System.out.println("Program finished.");
    }

    public static int divideByTwo(int num) throws CustomException {
        if (num % 2 != 0) {
            throw new CustomException("Custom Exception: Number must be even.");
        }
        return num / 2;
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
