package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RedStrikeTest {
    @Test
    fun `Should implement Red Strike outcome by incrementing score by 3`() {
        val strike = RedStrike()
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(3, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should invalidate board config for outcome`() {
        val strike = RedStrike()
        val boardConfig = BoardConfig(1, 0)

        assertFalse(strike.isBoardConfigValid(boardConfig))
    }

    @Test
    fun `Should validate board config for outcome`() {
        val strike = RedStrike()
        val boardConfig = BoardConfig(1, 1)

        assertTrue(strike.isBoardConfigValid(boardConfig))
    }

    @Test
    fun `Should decrement number of red coin by one`() {
        val strike = RedStrike()
        val boardConfig = BoardConfig(1, 1)
        val newBoardConfig = strike.calculateNewBoardConfig(boardConfig)

        assertEquals(BoardConfig(1, 0), newBoardConfig)
    }
}