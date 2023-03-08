package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats

class NoneOutcome : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        var outcome = playerStats.incrementConsecutivePocketMiss()
        outcome = if (outcome.consecutivePocketMiss == 3) outcome.decrementScoreBy(1).resetConsecutivePocketMiss() else outcome
        return outcome
    }

    override fun isBoardConfigValid(boardConfig: BoardConfig): Boolean = true

    override fun calculateNewBoardConfig(boardConfig: BoardConfig): BoardConfig = boardConfig
}
