package com.clean_strike.outcome

import com.clean_strike.outcome.OutcomeType.*
import org.junit.jupiter.api.Assertions.assertInstanceOf
import org.junit.jupiter.api.Test

class OutcomeTypeTest {
    @Test
    fun `Should return correct Outcome instance for particular outcomeType`() {
        assertInstanceOf(Strike::class.java, STRIKE.outcome)
        assertInstanceOf(MultiStrike::class.java, MULTI_STRIKE.outcome)
        assertInstanceOf(RedStrike::class.java, RED_STRIKE.outcome)
        assertInstanceOf(StrikerStrike::class.java, STRIKER_STRIKE.outcome)
        assertInstanceOf(DefunctCoin::class.java, DEFUNCT_COIN.outcome)
        assertInstanceOf(NoneOutcome::class.java, NONE.outcome)
    }
}
