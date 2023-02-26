package com.clean_strike.coin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RedCoinTest {
    @Test
    fun `Should check the points of black coin to be 1`() {
        assertEquals(3, RedCoin.POINTS)
    }
}
