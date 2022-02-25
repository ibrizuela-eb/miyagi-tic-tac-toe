class Game() {
    var board: String = "         "

    fun raffleTeamForPlayers(playerOneName: String, playerTwoName: String): Map<String, String> {
        return mapOf("X" to playerOneName, "O" to playerTwoName)
    }
}