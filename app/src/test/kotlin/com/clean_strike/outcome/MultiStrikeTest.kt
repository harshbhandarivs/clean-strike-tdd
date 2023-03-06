package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MultiStrikeTest {
    @Test
    fun `Should implement Single Strike outcome by incrementing score by 1`() {
        val strike = MultiStrike()
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(2, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should invalidate board config for outcome`() {
        val strike = MultiStrike()
        val boardConfig = BoardConfig(1, 0)

        assertFalse(strike.isBoardConfigValid(boardConfig))
    }

    @Test
    fun `Should validate board config for outcome`() {
        val strike = MultiStrike()
        val boardConfig = BoardConfig(2, 0)

        assertTrue(strike.isBoardConfigValid(boardConfig))
    }
}