import java.util.Scanner

fun main(args: Array<String>) {
    var player1 = Player()
    var player2 = Player()
    var currentPlayer = player2
    player1.mark = "X"
    player2.mark = "O"
    var board = PlayBoard()

    val scanner = Scanner(System.`in`)

    fun changeTurnsOfThePlayer() {
        if (player1 == currentPlayer) {
            currentPlayer = player2
        } else {
            currentPlayer = player1
        }
    }

    while (!board.gameIsOver) {
        changeTurnsOfThePlayer()

        println("Trage die Zeile ein:")
        val chosenRow = Integer.parseInt(scanner.nextLine())

        println("Trage die Spalte ein:")
        val chosenColumn = Integer.parseInt(scanner.nextLine())

        board.setMarkOnTheBoard(chosenRow, chosenColumn, currentPlayer.mark)
}
    if (board.gameIsOver) {
        println("Glückwunsch du hast gewonnen")
        board.resetGame()

    }






}