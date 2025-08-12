public class Main {
    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();
        game.printBoard(game.gameBoard);
        game.placePiece(game.gameBoard,0,"player");
    }
}
