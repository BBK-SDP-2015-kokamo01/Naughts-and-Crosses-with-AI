package scala

import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

class BoardSpec extends FlatSpec with Matchers with MockitoSugar {

  val board = Board(3)

  "A board" should "return a winner if there is one" in {
    val p1 = mock[Player]
    board.set((0,0), p1)
    board.set((0,1), p1)
    board.set((0,2), p1)

    board.getWinner should be (p1)
  }
}
