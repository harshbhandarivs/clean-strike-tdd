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
}
