package com.clean_strike.player

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlayerStatsTest {
    @Test
    fun `Should increment score by given value`() {
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = playerStats.incrementScoreBy(2)

        assertEquals(PlayerStats(2, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should increment fouls by given value`() {
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = playerStats.incrementFoulsBy(2)

        assertEquals(PlayerStats(0, 2, 0), newPlayerStats)
    }

    @Test
    fun `Should increment consecutive non zero by given value`() {
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = playerStats.incrementConsecutivePocketMiss()

        assertEquals(PlayerStats(0, 0, 1), newPlayerStats)
    }

    @Test
    fun `Should decrement score by given value`() {
        val playerStats = PlayerStats(2, 0, 0)

        val newPlayerStats = playerStats.decrementScoreBy(2)

        assertEquals(PlayerStats(0, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should decrement score by given value and make sure score does not go below zero`() {
        val playerStats = PlayerStats(1, 0, 0)

        val newPlayerStats = playerStats.decrementScoreBy(2)

        assertEquals(PlayerStats(0, 0, 0), newPlayerStats)
    }
}
