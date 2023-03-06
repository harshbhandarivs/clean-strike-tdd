package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test

class MultiStrikeTest {
    @Test
    fun `Should implement Single Strike outcome by incrementing score by 1`() {
        val strike = MultiStrike()
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        kotlin.test.assertEquals(PlayerStats(2, 0, 0), newPlayerStats)
    }
}