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

	@Test
	fun testGamePlayersAttributeType() {
		assertTrue(testGame.players is MutableList<Player>)
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
	fun testRaffleTeamForPlayersType() {
		val playerOneName: String = "foo"
		val playerTwoName: String = "bar"
		val teamRaffled = testGame.raffleTeamForPlayers(playerOneName, playerTwoName)
		assertTrue(teamRaffled[playerOneName] is String)
		assertTrue(teamRaffled[playerTwoName] is String)
	}

	@Test
	fun testCreatePlayers() {
		val playerOneName: String = "foo"
		val playerTwoName: String = "bar"
		val game: Game = Game()
		game.createPlayers(playerOneName, playerTwoName)
		assertEquals(game.players[0].name, playerOneName)
		assertEquals(game.players[1].name, playerTwoName)
	}
}
