import java.util.*; 

public class GamesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose a game:");
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Rock Paper Scissors");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    playTicTacToe();
                    break;
                case 2:
                    //System.out.println("Step 1 - inside switch case rock paper scissors");
                    playRockPaperScissors();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void playTicTacToe() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
    }

    public static void playRockPaperScissors() {
        //System.out.println("Step 2 - before create RPS object");
        RockPaperScissors rps = new RockPaperScissors();
        //System.out.println("Step 3 - before calling play method");
        rps.play();
    }
}

class TicTacToe {
    private String[] board;
    private String turn;

    public TicTacToe() {
        board = new String[9];
        turn = "X";
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        String winner = null;

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        while (winner == null) {
            int numInput;
            System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");

            try {
                numInput = scanner.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                scanner.next();
                continue;
            }

            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
            }
        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }

        scanner.close();
    }

    private String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }

        return null;
    }

    private void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
}

class RockPaperScissors {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";

    public void play() {
        String[] choices = {ROCK, PAPER, SCISSORS};
        Random random = new Random();

        System.out.println("Let's play Rock Paper Scissors!");
        Scanner scan = new Scanner(System.in);

        while (true) {
            //System.out.println("Step 4 - inside while loop");
            System.out.println("Enter your choice (rock, paper, scissors) or 'exit' to quit:");
            String userChoice = scan.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Exiting the game.");
                break;
            }

            //System.out.println("Step 5 - before invalid choice condition");
            //System.out.println("Step 5b - user entered choice: "+userChoice);
            
            if (!userChoice.equals(ROCK) && 
            !userChoice.equals(PAPER) && 
            !userChoice.equals(SCISSORS)) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerIndex];

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }
    }

    private String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (
                (userChoice.equals(ROCK) && computerChoice.equals(SCISSORS)) ||
                (userChoice.equals(PAPER) && computerChoice.equals(ROCK)) ||
                (userChoice.equals(SCISSORS) && computerChoice.equals(PAPER))
        ) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}

