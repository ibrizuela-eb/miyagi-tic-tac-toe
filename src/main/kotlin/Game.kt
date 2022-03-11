class Game() {
    var board: String = "         "
	val players: MutableList<Player> = mutableListOf()

	fun raffleTeamForPlayers(playerOneName: String, playerTwoName: String): Map<String, String> {
		/* This method receives 2 names of player and assigns a team to each one
		Inputs
		 	"Nacho", "Mauri"
		Output
			{"Nacho"="X", "Mauri"="O"}
		*/
		return mapOf(playerOneName to "X", playerTwoName to "O")
	}

	fun createPlayers(playerOneName: String, playerTwoName: String): MutableList<Player> {
		val teamRaffled = this.raffleTeamForPlayers(
			playerOneName = playerOneName,
			playerTwoName = playerTwoName
		)
		val playerOne: Player = Player(
			name = playerOneName,
			team = teamRaffled[playerOneName]
		)
		val playerTwo: Player = Player(
			name = playerTwoName,
			team = teamRaffled[playerTwoName]
		)
		return mutableListOf(playerOne, playerTwo)
	}
}
