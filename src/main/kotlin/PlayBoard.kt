class PlayBoard {
    private val empty = "___"
    var board = Array(3) { Array<String>(3) { empty } }
    var gameIsOver = false

    fun printBoard() {
        for (row in board) {
            for (element in row) {
                if (element == empty) {
                    print("|$element|")
                } else {
                    print("| $element |")
                }
            }
            println()
        }
    }

    fun setMarkOnTheBoard(row: Int, column: Int, mark: String) {
        if (!gameIsOver
            && !hasWonThisGame(mark)
            && checkIfMarkPositionIsValid(row, column)
            && board[row - 1][column - 1] == empty
        ) {
            board[row - 1][column - 1] = mark
            printBoard()
            hasWonThisGame(mark)
        }
    }

    fun checkIfMarkPositionIsValid(row: Int, column: Int) =
        (row in 1..3) && (column in 1..3)


    fun resetGame() {
        resetBoard()
        gameIsOver = false
    }

    fun resetBoard() {
        board = Array(3) { Array<String>(3) { empty } }
    }

    fun hasWonThisGame(mark: String): Boolean {
        for (i in 0..2) {
            if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
                gameIsOver = true
                return true
            }
            if (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) {
                gameIsOver = true
                return true
            }
            if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
                gameIsOver = true
                return true
            }
            if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
                gameIsOver = true
                return true
            }
        }
        return false
    }



}

