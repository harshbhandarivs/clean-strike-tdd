package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats

class StrikerStrike : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        var outcome = playerStats.decrementScoreBy(1).incrementFoulsBy(1).incrementConsecutivePocketMiss()
        outcome = if (outcome.consecutivePocketMiss == 3) outcome.decrementScoreBy(1).resetConsecutivePocketMiss() else outcome
        outcome = if (outcome.fouls == 3) outcome.decrementScoreBy(1).resetFouls() else outcome
        return outcome
    }

    override fun isBoardConfigValid(boardConfig: BoardConfig): Boolean = true

    override fun calculateNewBoardConfig(boardConfig: BoardConfig): BoardConfig = boardConfig
}
