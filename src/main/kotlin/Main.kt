import java.util.Scanner

fun main(args: Array<String>) {
    val board = PlayBoard()
    val scanner = Scanner(System.`in`)

    println("Hi, trage den Namen des ersten Spielers ein:")
    val namePlayer1 = scanner.nextLine()
    println("jetzt noch den zweiten Spieler:")
    val namePlayer2 = scanner.nextLine()

    val player1 = Player(namePlayer1, "X")
    val player2 = Player(namePlayer2, "O")
    var currentPlayer = player2

    fun changeTurnsOfThePlayer() {
        currentPlayer = if(player1 == currentPlayer) player2 else player1
    }

    while (!board.gameIsOver) {
        changeTurnsOfThePlayer()

        println("${currentPlayer.name} du bist dran, trage die Zeile ein:")
        val chosenRow = Integer.parseInt(scanner.nextLine())

        println("${currentPlayer.name} trage jetzt noch die Spalte ein:")
        val chosenColumn = Integer.parseInt(scanner.nextLine())

        board.setMarkOnTheBoard(chosenRow, chosenColumn, currentPlayer.mark)
}
    if (board.gameIsOver) {
        println("Glückwunsch ${currentPlayer.name} du hast gewonnen!")
        board.resetGame()

    }






}