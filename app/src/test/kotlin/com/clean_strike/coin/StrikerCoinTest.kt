package com.clean_strike.coin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StrikerCoinTest {
    @Test
    fun `Should check the points of striker coin to be 0`() {
        val strikerCoin = StrikerCoin()

        assertEquals(0, strikerCoin.getPoints())
    }
}
