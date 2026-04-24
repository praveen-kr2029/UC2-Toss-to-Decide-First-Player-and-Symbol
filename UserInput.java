import java.util.Scanner;

class UserInput {

    Scanner scanner = new Scanner(System.in);

    // Method to get slot input from user
    public int getUserSlot() {
        int slot;

        System.out.print("Enter a slot number (1-9): ");
        slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {
        UserInput input = new UserInput();

        int chosenSlot = input.getUserSlot();

        System.out.println("You selected slot: " + chosenSlot);
    }
}
