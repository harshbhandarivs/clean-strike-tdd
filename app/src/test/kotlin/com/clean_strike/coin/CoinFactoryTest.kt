package com.clean_strike.coin

import org.junit.jupiter.api.Assertions.assertInstanceOf
import org.junit.jupiter.api.Test

class CoinFactoryTest {
    @Test
    fun `Should create coin of given type`() {
        assertInstanceOf(BlackCoin::class.java, CoinFactory.getCoin(CoinType.BLACK))
        assertInstanceOf(RedCoin::class.java, CoinFactory.getCoin(CoinType.RED))
        assertInstanceOf(StrikerCoin::class.java, CoinFactory.getCoin(CoinType.STRIKER))
    }
}
