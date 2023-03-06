package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats

interface Outcome {
    fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats
}
