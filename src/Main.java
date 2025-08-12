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
    // place within a while(true){} method - runs until there is a winner / a tie
    // show board, user input, show board, cpu input, show board, repeat
    public static void placePiece (char[][] gameBoard,int position, String user){
        // define symbols - standard, player and cpu
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }

        // request and take in user move - scanner and nextInt()
        // if space is unoccupied -> place in the grid
        Scanner scan = new Scanner(System.in);
        int playerPostion = scan.nextInt();

        // automatically generate cpu move (if space is unoccupied -> place in the grid)
        Random rand = new Random();
        int cpuPosition = rand.nextInt(9) + 1; // why 9 + 1

        // switch/case for linking position and symbol
        switch (position) {
            case 1:
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

    public boolean checkPosition (char[][] gameBoard, int position){
        // must check if the position contains ' ' - if not it is taken
        if(symbol.equals(' ')){
            //
            return true;
        } else {
            System.out.println("invalid postion, something is already here");
            return false;
        }
    }

    // check status - win / lose
}

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.printBoard(game.gameBoard);
        game.placePiece(game.gameBoard,0,"player");
    }
}
