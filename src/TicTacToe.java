import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    // set up board - rows and cols = 2d array
    // must include both empty spaces for XO and symbols forming grid
    char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    // print game board
    public static void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) { // each row of array
            for (char c : row) { // each element of the row
                System.out.print(c); // print value of element "c"
            }
            System.out.println(); // add new line after each row
        }
    }

    // method - place pieces on the board, corresponding to set position - if free
    // show board, user input, show board, cpu input, show board, repeat
    public static void placePiece (char[][] gameBoard,int position, String user){
        // define symbols - standard, player and cpu
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }

        // switch/case for linking position and symbol (depends on the user X/O)
        switch (position) {
            case 1:
                // i think this might be correct, but how to do it elsewhere? must match the position
                if(gameBoard[0][0] == ' ') {
                    gameBoard[0][0] = symbol;
                }
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid placement");
                break;
        }
    }

    public boolean checkPosition (char[][] gameBoard, int position, char symbol){
        // must check if the position contains ' ' - if not it is taken

        // idea - if char c of [][] gameBoard = ' ', then true

        // loop through using for-each (?) we know the specific position though
        // could i not traverse but simply do a containment check nested within switch (via method call)?
        // check if the value is ' '

        if(gameBoard[][] == ' ') {
            // then the symbol can be set for the given position
            return true;
        } else {
            return false;
        }


        if(symbol == ' '){ // should maybe not check symbol, but rather element of the array
            // addition logic - set method?
            return true;
        } else {
            System.out.println("invalid postion, something is already here");
            return false;
        }
    }

    // while(true) method - runs until there is a winner / a tie - add logic for this!
    while(true) {
        // request and take in user move - scanner and nextInt()
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        printBoard(gameBoard);

        // add logic: if space is unoccupied -> place in the grid
        int playerPostion = scan.nextInt();

        // logic connecting to placePiece and the switch statement
        placePiece(gameBoard, playerPostion, "player");

        printBoard(gameBoard);

        // automatically generate cpu move (if space is unoccupied -> place in the grid)
        int cpuPosition = rand.nextInt(9) + 1; // why 9 + 1
        placePiece(gameBoard, cpuPosition, "cpu");

        printBoard(gameBoard);
    }

    // check status - win / lose
}