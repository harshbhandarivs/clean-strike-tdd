package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.outcome.Outcome
import com.clean_strike.outcome.OutcomeType
import com.clean_strike.player.PlayerStats

class CaromBoard(
    private var boardConfig: BoardConfig,
    private val playerStatsMap: MutableMap<Int, PlayerStats>
) {

    fun play(playerNumber: Int, outcomeType: OutcomeType) {
        val outcome = outcomeType.outcome
        if (outcome.isBoardConfigValid(boardConfig) && playerStatsMap.containsKey(playerNumber)) {
            setPlayerStats(playerNumber, outcome)
            setBoardConfig(outcome)
        }
    }

    private fun setBoardConfig(outcome: Outcome) {
        boardConfig = outcome.calculateNewBoardConfig(boardConfig)
    }

    private fun setPlayerStats(playerNumber: Int, outcome: Outcome) {
        val playerStats = playerStatsMap[playerNumber] ?: return
        playerStatsMap[playerNumber] = outcome.calculateNewPlayerStats(playerStats)
    }

    fun gameResult(): String {
        val (player1Score) = playerStatsMap[0]!!
        val (player2Score) = playerStatsMap[1]!!
        val isPlayer1Winner = isPlayerWinner(player1Score, player2Score)
        val isPlayer2Winner = isPlayerWinner(player2Score, player1Score)
        if (isPlayer1Winner) {
            return "Player 0 is winner"
        }
        if (isPlayer2Winner) {
            return "Player 1 is winner"
        }
        if (boardConfig.isBoardEmpty()) {
            return "It is a draw"
        }
        return "Game is not over"
    }

    private fun isPlayerWinner(givenPlayerScore: Int, opponentPlayerScore: Int): Boolean {
        return givenPlayerScore >= 5 && (givenPlayerScore - opponentPlayerScore) >= 3
    }
}