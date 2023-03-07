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
        try {
            val playerStatsAboveOrEqualTo5 = playerStatsMap.entries.first { it.value.score >= 5 }
            val playerStatsCount = playerStatsMap.entries.filter { it != playerStatsAboveOrEqualTo5 }
                .count { (playerStatsAboveOrEqualTo5.value.score - it.value.score) <= 3 }
            if (playerStatsCount == 0) return "Player ${playerStatsAboveOrEqualTo5.key} is winner"
            return if (boardConfig.isBoardEmpty()) "It is a draw" else "Game is not over"
        } catch (exception: NoSuchElementException) {
            return if (boardConfig.isBoardEmpty()) "It is a draw" else "Game is not over"
        }
    }
}