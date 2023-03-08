package com.clean_strike.player

import kotlin.math.max

data class PlayerStats(val score: Int, val fouls: Int, val consecutivePocketMiss: Int) {
    fun incrementScoreBy(value: Int): PlayerStats {
        return PlayerStats(score + value, fouls, consecutivePocketMiss)
    }

    fun decrementScoreBy(value: Int): PlayerStats {
        return PlayerStats(max(score - value, 0), fouls, consecutivePocketMiss)
    }

    fun incrementFoulsBy(value: Int): PlayerStats {
        return PlayerStats(score, fouls + value, consecutivePocketMiss)
    }

    fun incrementConsecutivePocketMiss(): PlayerStats {
        return PlayerStats(score, fouls, consecutivePocketMiss + 1)
    }

    fun resetConsecutivePocketMiss(): PlayerStats {
        return PlayerStats(score, fouls, 0)
    }

    fun resetFouls(): PlayerStats {
        return PlayerStats(score, 0, consecutivePocketMiss)
    }
}
