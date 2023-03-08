package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats

class Strike : Outcome {
    override fun calculateNewPlayerStats(playerStats: PlayerStats): PlayerStats {
        return playerStats.incrementScoreBy(1).resetConsecutivePocketMiss()
    }

    override fun isBoardConfigValid(boardConfig: BoardConfig): Boolean = boardConfig.numberOfBlackCoin > 0

    override fun calculateNewBoardConfig(boardConfig: BoardConfig): BoardConfig = boardConfig.decrementBlackCoinsBy(1)

}
