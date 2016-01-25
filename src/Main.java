import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Binary to Decimal Converer!\n");
        System.out.println("Enter binary number value:");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println("You have entered: " + buffer + " as your input.");
        System.out.println("Your number is "+ Integer.toString(Binary2decimal(buffer))+".");
    }


    private static int Binary2decimal (String binary){
        int result = 0;
        for(int i = 0; i < binary.length(); i++)
        {
            int digit = Character.getNumericValue(binary.charAt(i));
            int position = binary.length() - i -1;
            result += digit * Math.pow(2, position);
        }
        return result;
    }
}