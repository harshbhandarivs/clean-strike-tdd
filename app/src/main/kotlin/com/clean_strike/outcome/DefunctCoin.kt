package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats

class DefunctCoin : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        var outcome = playerStats.decrementScoreBy(2).incrementFoulsBy(1).incrementConsecutiveZero()
        outcome = if(outcome.consecutiveZero == 3) outcome.decrementScoreBy(1).resetConsecutiveZeros() else outcome
        outcome = if(outcome.fouls == 3) outcome.decrementScoreBy(1).resetFouls() else outcome
        return outcome
    }

    override fun isBoardConfigValid(boardConfig: BoardConfig): Boolean = boardConfig.numberOfBlackCoin > 0
}