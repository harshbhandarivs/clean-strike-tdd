package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StrikerStrikeTest {
    @Test
    fun `Should implement Striker Strike outcome by decrementing score by 1 and incrementing fouls and consecutive zero by 1`() {
        val strike = StrikerStrike()
        val playerStats = PlayerStats(3, 1, 1)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(2, 2, 2), newPlayerStats)
    }
}
