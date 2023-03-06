package com.clean_strike.board

import java.lang.Integer.max

data class BoardConfig(val numberOfBlackCoin: Int, val numberOfRedCoin: Int) {
    fun decrementBlackCoinsBy(value: Int) = BoardConfig(max(numberOfBlackCoin - value, 0), numberOfRedCoin)

    fun decrementRedCoinsBy(value: Int) = BoardConfig(numberOfBlackCoin, max(numberOfRedCoin - value, 0))
}
