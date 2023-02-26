package com.clean_strike.coin

enum class CoinType(private val coin: () -> Coin) {
    BLACK({ BlackCoin() }),
    RED({ RedCoin() }),
    STRIKER({ StrikerCoin() });

    fun getCoin(): Coin = coin()
}
