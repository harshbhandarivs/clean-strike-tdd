package com.clean_strike.player

import kotlin.math.max

data class PlayerStats(val score: Int, val fouls: Int, val consecutiveZero: Int) {
    fun incrementScoreBy(value: Int): PlayerStats {
        return PlayerStats(score + value, fouls, 0)
    }

    fun decrementScoreBy(value: Int): PlayerStats {
        return PlayerStats(max(score - value, 0), fouls, consecutiveZero)
    }

    fun incrementFoulsBy(value: Int): PlayerStats {
        return PlayerStats(score, fouls + value, consecutiveZero)
    }

    fun incrementConsecutiveZero(): PlayerStats {
        return PlayerStats(score, fouls, consecutiveZero + 1)
    }
}
