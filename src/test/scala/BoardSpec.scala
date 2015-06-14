package scala

import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

class BoardSpec extends FlatSpec with Matchers with MockitoSugar {

  val board = Board(3)

  "A board" should "return true if there is a winner in the top row" in {
    val p1 = mock[Player]
    val p2 = mock[Player]
    board.set((0,0), p1)
    board.set((0,1), p1)
    board.set((0,2), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in the middle row" in {
    val p1 = mock[Player]
    board.set((1,0), p1)
    board.set((1,1), p1)
    board.set((1,2), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in the bottom row" in {
    val p1 = mock[Player]
    board.set((2,0), p1)
    board.set((2,1), p1)
    board.set((2,2), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in the left column" in {
    val p1 = mock[Player]
    board.set((0,0), p1)
    board.set((1,0), p1)
    board.set((2,0), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in the middle column" in {
    val p1 = mock[Player]
    board.set((0,1), p1)
    board.set((1,1), p1)
    board.set((2,1), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in the right column" in {
    val p1 = mock[Player]
    board.set((0,2), p1)
    board.set((1,2), p1)
    board.set((2,2), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in right diagonal" in {
    val p1 = mock[Player]
    board.set((0,0), p1)
    board.set((1,1), p1)
    board.set((2,2), p1)

    board.isWinner(p1) should be (true)
  }

  "A board" should "return true if there is a winner in left diagonal" in {
    val p1 = mock[Player]
    board.set((0,2), p1)
    board.set((1,1), p1)
    board.set((2,0), p1)

    board.isWinner(p1) should be (true)
  }
}
