package scala

class Board(size: Int) {

  val board = Array.ofDim[Player](size, size)

  def set(coordinate: (Int, Int), player: Player): Unit = {
    board(coordinate._1)(coordinate._2) = player
  }

  def getWinner: Option[Player] = ???

  //  {
  //    board.map(row => row.zipWithIndex)
  //
  //  }

  def checkRows: Boolean = board.map(row => row.count(_ != null)).contains(size)

  def checkColumn: Boolean = board.transpose.map(col => col.count(_ != null)).contains(size)

  def checkRightDiagonal: Boolean = {
    board.
  }
}

object Board {
  def apply(x: Int): Board = {
    new Board(x)
  }
}