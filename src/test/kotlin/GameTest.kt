import org.junit.jupiter.api.Assertions.* // ktlint-disable no-wildcard-imports
import org.junit.jupiter.api.Test

internal class GameTest {
    private val testGame: Game = Game()

    @Test
    fun testGameBoardAttributeType() {
        assertTrue(testGame.board is String)
    }

    @Test
    fun testGameBoardAttributeLength() {
        assertEquals(testGame.board.length, 9)
    }
}
