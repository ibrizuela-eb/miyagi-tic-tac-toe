class Game() {
    var board: String = "         "
    var players = List<Player>()

    fun raffleTeamForPlayers(playerOneName: String, playerTwoName: String): Map<String, String> {
        return mapOf(playerOneName to "X", playerTwoName to "O")
    }

    fun createPlayers(playerOneName: String, playerTwoName: String): List<Player?> {
        val teams = this.raffleTeamForPlayers(playerOneName, playerTwoName)
        val playerOne: Player? = teams[playerOneName]?.let { Player(playerOneName, it) }
        val playerTwo: Player? = teams[playerTwoName]?.let { Player(playerTwoName, it) }
        return listOf(playerOne, playerTwo)
    }
}