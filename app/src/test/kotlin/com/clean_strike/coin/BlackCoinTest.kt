package com.clean_strike.coin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BlackCoinTest {
    @Test
    fun `Should check the points of black coin to be 1`() {
        assertEquals(1, BlackCoin.POINTS)
    }
}
