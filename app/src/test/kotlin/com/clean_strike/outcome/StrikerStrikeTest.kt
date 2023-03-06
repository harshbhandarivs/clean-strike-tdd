package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class StrikerStrikeTest {
    @Test
    fun `Should implement Striker Strike outcome by decrementing score by 1 and incrementing fouls and consecutive zero by 1`() {
        val strike = StrikerStrike()
        val playerStats = PlayerStats(3, 1, 1)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(2, 2, 2), newPlayerStats)
    }

    @Test
    fun `Should implement Striker Strike outcome for two consecutive zeros`() {
        val strike = StrikerStrike()
        val playerStats = PlayerStats(3, 1, 2)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(1, 2, 0), newPlayerStats)
    }

    @Test
    fun `Should implement Striker Strike outcome for two fouls`() {
        val strike = StrikerStrike()
        val playerStats = PlayerStats(3, 2, 1)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(1, 0, 2), newPlayerStats)
    }

    @Test
    fun `Should validate board config for outcome`() {
        val strike = StrikerStrike()
        val boardConfig = BoardConfig(0, 0)

        assertTrue(strike.isBoardConfigValid(boardConfig))
    }
}
