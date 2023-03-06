package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats

class Strike : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.incrementScoreBy(1).resetConsecutiveZeros()
    }

}