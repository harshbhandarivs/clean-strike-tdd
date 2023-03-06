package com.clean_strike.coin

class RedCoin : Coin {
    companion object {
        const val POINTS = 3
    }

    override fun getPoints(): Int = POINTS
}
