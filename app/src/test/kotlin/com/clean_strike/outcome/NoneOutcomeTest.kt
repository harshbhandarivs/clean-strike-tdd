package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
}