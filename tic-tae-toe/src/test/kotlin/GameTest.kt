import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GameTest {
    private val testGame: Game = Game()

    @Test
    fun testGameAttributesType() {
        assertTrue(testGame.board is String)
    }
}