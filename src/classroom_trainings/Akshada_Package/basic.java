package classroom_trainings.Akshada_Package;

public class basic {
    public static void main(String[] args) {
        // Define a binary number as a string
        String binary = "1010"; // binary for 10

        // Convert binary to decimal using built-in method
        int decimal = Integer.parseInt(binary, 2);

        // Print both values
        System.out.println("Binary number: " + binary);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
