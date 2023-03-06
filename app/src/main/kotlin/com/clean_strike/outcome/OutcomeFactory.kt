package com.clean_strike.outcome

class OutcomeFactory {
    companion object {
        fun getOutcome(outcomeType: OutcomeType) = outcomeType.outcome()
    }
}
