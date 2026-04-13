public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Create StringBuilder
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = "";
        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Print final output
        System.out.println("Hello, " + names + "!");
    }
}