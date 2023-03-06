package com.clean_strike.outcome

import com.clean_strike.player.PlayerStats

class DefunctCoin : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.decrementScoreBy(2).incrementFoulsBy(1).incrementConsecutiveZero()
    }

}