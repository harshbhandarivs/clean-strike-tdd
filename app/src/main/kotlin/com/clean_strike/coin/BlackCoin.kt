package com.clean_strike.coin

class BlackCoin : Coin {
    companion object {
        const val POINTS = 1
    }

    override fun getPoints(): Int = POINTS
}
