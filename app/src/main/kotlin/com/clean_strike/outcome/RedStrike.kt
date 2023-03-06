package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats

class RedStrike : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.incrementScoreBy(3).resetConsecutiveZeros()
    }

    override fun isBoardConfigValid(boardConfig: BoardConfig): Boolean = boardConfig.numberOfRedCoin > 0
}