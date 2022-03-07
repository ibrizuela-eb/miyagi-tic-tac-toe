import org.junit.jupiter.api.Assertions.* // ktlint-disable no-wildcard-imports
import org.junit.jupiter.api.Test

internal class PlayerTest {
    @Test
    fun testPlayerHasNameAndTeamWhenIsCreated() {
        val testPlayer: Player = Player("foo", "X")
        assertEquals(testPlayer.name, "foo")
        assertEquals(testPlayer.team, "X")
    }
}
