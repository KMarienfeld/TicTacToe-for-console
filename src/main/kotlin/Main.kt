import java.util.Scanner

fun main(args: Array<String>) {
    val player1 = Player()
    val player2 = Player()
    var currentPlayer = player2
    player1.mark = "X"
    player2.mark = "O"
    val board = PlayBoard()

    val scanner = Scanner(System.`in`)

    fun changeTurnsOfThePlayer() {
        currentPlayer = if(player1 == currentPlayer) player2 else player1
    }

    println("Hi, trage den Namen des ersten Spielers ein:")
    player1.name = scanner.nextLine()
    println("jetzt noch den zweiten Spieler:")
    player2.name = scanner.nextLine()

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