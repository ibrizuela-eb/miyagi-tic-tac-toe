import org.junit.jupiter.api.Assertions.*
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

    @Test
    fun testGamePlayersAttributeType() {
        assertTrue(testGame.players is List<Player>)
    }

    @Test
    fun testRaffleTeamForPlayers() {
        val playerOneName: String = "foo"
        val playerTwoName: String = "bar"
        val teamRaffled = testGame.raffleTeamForPlayers(playerOneName, playerTwoName)
        assertEquals(teamRaffled[playerOneName], "X")
        assertEquals(teamRaffled[playerTwoName], "O")
    }

    @Test
    fun testCreatePlayers() {
        val players = testGame.createPlayers("foo", "bar")
        assertEquals(players[0]?.name ?: null, "foo")
        assertEquals(players[1]?.name ?: null, "bar")
    }
}