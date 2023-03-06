package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats

class StrikerStrike: Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.decrementScoreBy(1).incrementFoulsBy(1).incrementConsecutiveZero()
    }
}
