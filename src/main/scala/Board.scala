package scala

class Board(size: Int) {

  val board = Array.ofDim[Player](size, size)

  def set(coordinate: (Int, Int), player: Player): Unit = {
    board(coordinate._1)(coordinate._2) = player
  }

  def isWinner(player: Player): Boolean =
    checkRows(player) || checkColumn(player) || checkRightDiagonal(player) || checkLeftDiagonal(player)

  def isFull: Boolean =
    board.forall(!_.contains(null))

  private def checkRows(player: Player): Boolean =
    board.map(row => row.count(_ == player)).contains(size)

  private def checkColumn(player: Player): Boolean =
    board.transpose.map(col => col.count(_ == player)).contains(size)

  private def checkRightDiagonal(player: Player): Boolean =
    (0 until size).count(index => board(index)(index) == player) == size

  private def checkLeftDiagonal(player: Player): Boolean =
    (0 until size).count(index => board(index)((size - 1) - index) == player) == size
}

object Board {
  def apply(x: Int): Board = {
    new Board(x)
  }
}