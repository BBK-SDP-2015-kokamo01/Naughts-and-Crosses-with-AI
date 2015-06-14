package scala

class Game (board: Board) {

  def makeMove(player: Player): Unit ={
    val coordinate = player.makeMove()
    board.set(coordinate, player)
  }

  def getWinner(): Player = {
    board.getWinner()
  }

}
