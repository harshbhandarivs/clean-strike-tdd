package com.clean_strike.outcome

import com.clean_strike.outcome.OutcomeType.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OutcomeFactoryTest{
    @Test
    fun `Should return correct outcome for particular outcomeType`() {
        assertInstanceOf(Strike::class.java, OutcomeFactory.getOutcome(STRIKE))
        assertInstanceOf(MultiStrike::class.java, OutcomeFactory.getOutcome(MULTI_STRIKE))
        assertInstanceOf(RedStrike::class.java, OutcomeFactory.getOutcome(RED_STRIKE))
        assertInstanceOf(StrikerStrike::class.java, OutcomeFactory.getOutcome(STRIKER_STRIKE))
        assertInstanceOf(DefunctCoin::class.java, OutcomeFactory.getOutcome(DEFUNCT_COIN))
        assertInstanceOf(NoneOutcome::class.java, OutcomeFactory.getOutcome(NONE))
    }
}
