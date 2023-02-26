package com.clean_strike.coin

class CoinFactory {
    companion object {
        fun getCoin(coinType: CoinType): Coin {
            return coinType.getCoin()
        }
    }
}