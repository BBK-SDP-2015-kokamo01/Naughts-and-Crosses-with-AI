package scala

class Game (board: Board) {

  def play(): Unit = ???

  def over(): Boolean = ???

  def makeMove(player: Player): Unit ={
    val coordinate = player.makeMove()
    board.set(coordinate, player)
//
//    if (board.isWinner(player)) {
//      gameOver()
//    }

  }


}
