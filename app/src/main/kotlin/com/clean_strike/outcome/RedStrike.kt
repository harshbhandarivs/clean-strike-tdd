package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats

class RedStrike : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.incrementScoreBy(3)
    }
}