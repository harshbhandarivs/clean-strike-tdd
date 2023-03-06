package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DefunctCoinTest {
    @Test
    fun `Should implement defunct coin outcome`() {
        val strike = DefunctCoin()
        val playerStats = PlayerStats(2, 1, 1)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 2, 2), newPlayerStats)
    }

    @Test
    fun `Should implement defunct coin outcome with already two consecutive zero`() {
        val strike = DefunctCoin()
        val playerStats = PlayerStats(3, 1, 2)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 2, 0), newPlayerStats)
    }

    @Test
    fun `Should implement defunct coin outcome with already two fouls`() {
        val strike = DefunctCoin()
        val playerStats = PlayerStats(4, 2, 2)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 0, 0), newPlayerStats)
    }
}
