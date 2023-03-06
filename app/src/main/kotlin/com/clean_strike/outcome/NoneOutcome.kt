package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats

class NoneOutcome: Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        var outcome = playerStats.incrementConsecutiveZero()
        outcome = if(outcome.consecutiveZero == 3) outcome.decrementScoreBy(1).resetConsecutiveZeros() else outcome
        return outcome
    }

    override fun isBoardConfigValid(boardConfig: BoardConfig): Boolean = true
}