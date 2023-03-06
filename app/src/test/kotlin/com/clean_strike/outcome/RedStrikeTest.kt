package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RedStrikeTest {
    @Test
    fun `Should implement Red Strike outcome by incrementing score by 3`() {
        val strike = RedStrike()
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(3, 0, 0), newPlayerStats)
    }
}