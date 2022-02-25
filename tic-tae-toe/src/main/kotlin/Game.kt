class Game() {
    var board: String = "         "
    val players: Array<Player> = Array(2) {
        Player("foo", "X");
        Player("bar", "O")
    }

    fun raffleTeamForPlayers(playerOneName: String, playerTwoName: String): Map<String, String> {
        return mapOf("X" to playerOneName, "O" to playerTwoName)
    }
}