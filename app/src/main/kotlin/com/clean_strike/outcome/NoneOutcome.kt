package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats

class NoneOutcome: Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.incrementConsecutiveZero()
    }
}