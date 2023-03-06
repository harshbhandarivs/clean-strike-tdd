package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NoneOutcomeTest {
    @Test
    fun `Should implement none outcome by incrementing consecutive zeros of player stats`() {
        val noneOutcome = NoneOutcome()
        val playerStats = PlayerStats(0, 0, 0)
        val newPlayerStats = noneOutcome.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 0, 1), newPlayerStats)
    }

    @Test
    fun `Should implement none outcome for two consecutive zeros`() {
        val noneOutcome = NoneOutcome()
        val playerStats = PlayerStats(1, 0, 2)
        val newPlayerStats = noneOutcome.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should validate board config for outcome`() {
        val defunctCoin = NoneOutcome()
        val boardConfig = BoardConfig(1, 0)

        assertTrue(defunctCoin.isBoardConfigValid(boardConfig))
    }

    @Test
    fun `Should return board config without any change`() {
        val strike = NoneOutcome()
        val boardConfig = BoardConfig(1, 0)
        val newBoardConfig = strike.calculateNewBoardConfig(boardConfig)

        assertEquals(newBoardConfig, newBoardConfig)
    }
}
