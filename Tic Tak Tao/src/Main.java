import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("=================================");
        System.out.println("Welcome to Snake and Ladder Game!");
        System.out.println("=================================");

        try {
            // Get number of players
            System.out.print("\nEnter number of players (2-4): ");
            int numPlayers = scanner.nextInt();

            if(numPlayers==2){
                System.out.println("Please babe give your name na");
                String p1=scanner.nextLine();
                String p2=scanner.nextLine();
            }else if(numPlayers==3){
                System.out.println("Please babe give your name na");
                String p1=scanner.nextLine();
                String p2=scanner.nextLine();
                String p3=scanner.nextLine();
            }else if(numPlayers==4){
                System.out.println("Please babe give your name na");
                String p1=scanner.nextLine();
                String p2=scanner.nextLine();
                String p3=scanner.nextLine();
                String p4=scanner.nextLine();
            }

            if (numPlayers < 2 || numPlayers > 4) {
                throw new IllegalArgumentException("Number of players must be between 2 and 4");
            }

            // Create and start the game
            Game game = new Game(numPlayers);

            // Display game rules
            displayRules();

            // Start the game after user confirmation
            System.out.print("\nPress Enter to start the game...");
            scanner.nextLine(); // Consume the previous newline
            scanner.nextLine(); // Wait for Enter key

            game.startGame();

        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nInvalid input. Please enter a number between 2 and 4.");
        } finally {
            scanner.close();
        }
    }

    private static void displayRules() {
        System.out.println("\nGame Rules:");
        System.out.println("1. The game is played on a board with 100 squares");
        System.out.println("2. Players take turns rolling a dice");
        System.out.println("3. If you land on a snake's head, you'll slide down to its tail");
        System.out.println("4. If you land on a ladder's bottom, you'll climb up to its top");
        System.out.println("5. You must land exactly on 100 to win");
        System.out.println("6. If your roll would take you beyond 100, you stay in place");

        // Display snake positions
        System.out.println("\nSnake Positions (Head -> Tail):");
        System.out.println("99 -> 10");
        System.out.println("65 -> 40");
        System.out.println("25 -> 9");
        System.out.println("95 -> 75");
        System.out.println("79 -> 19");
        System.out.println("88 -> 24");

        // Display ladder positions
        System.out.println("\nLadder Positions (Bottom -> Top):");
        System.out.println("13 -> 42");
        System.out.println("60 -> 83");
        System.out.println("70 -> 93");
        System.out.println("6 -> 45");
        System.out.println("37 -> 61");
        System.out.println("52 -> 71");
    }
}