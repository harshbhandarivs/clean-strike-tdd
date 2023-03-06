package com.clean_strike.outcome

enum class OutcomeType(val outcome: () -> Outcome) {
    STRIKE({ Strike() }),
    MULTI_STRIKE({ MultiStrike() }),
    RED_STRIKE({ RedStrike() }),
    STRIKER_STRIKE({ StrikerStrike() }),
    DEFUNCT_COIN({ DefunctCoin() }),
    NONE({ NoneOutcome() })
}
