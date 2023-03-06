package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.outcome.Outcome
import com.clean_strike.outcome.OutcomeFactory
import com.clean_strike.outcome.OutcomeType
import com.clean_strike.player.PlayerStats

class CaromBoard(
    private var boardConfig: BoardConfig,
    private var player1Stats: PlayerStats,
    private var player2Stats: PlayerStats
) {

    fun play(playerNumber: Int, outcomeType: OutcomeType) {
        val outcome = OutcomeFactory.getOutcome(outcomeType)
        if (outcome.isBoardConfigValid(boardConfig)) {
            setPlayerStats(playerNumber, outcome)
            setBoardConfig(outcome)
        }
    }

    private fun setBoardConfig(outcome: Outcome) {
        boardConfig = outcome.calculateNewBoardConfig(boardConfig)
    }

    private fun setPlayerStats(playerNumber: Int, outcome: Outcome) {
        if (playerNumber == 1) {
            player1Stats = outcome.calculateNewPlayerStats(player1Stats)
        } else {
            player2Stats = outcome.calculateNewPlayerStats(player2Stats)
        }
    }

    fun gameResult(): String {
        val isPlayer1Winner = isPlayerWinner(player1Stats, player2Stats)
        val isPlayer2Winner = isPlayerWinner(player2Stats, player1Stats)
        if (isPlayer1Winner) {
            return "Player 1 is winner"
        }
        if (isPlayer2Winner) {
            return "Player 2 is winner"
        }
        if (boardConfig.isBoardEmpty()) {
            return "It is a draw"
        }
        return "Game is not over"
    }

    private fun isPlayerWinner(givenPlayer: PlayerStats, opponentPlayer: PlayerStats): Boolean {
        val score1 = givenPlayer.score
        val score2 = opponentPlayer.score
        return score1 >= 5 && (score1 - score2) >= 3
    }
}