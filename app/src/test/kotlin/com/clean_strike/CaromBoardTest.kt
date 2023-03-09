package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.outcome.OutcomeType
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CaromBoardTest {
    private lateinit var caromBoard: CaromBoard

    @BeforeEach
    fun setUp() {
        caromBoard = CaromBoard(
            BoardConfig(9, 1),
            mutableMapOf(
                0 to PlayerStats(0, 0, 0),
                1 to PlayerStats(0, 0, 0)
            )
        )
    }

    @Test
    fun `Should check if player 1 is winner`() {
        caromBoard.play(0, OutcomeType.STRIKE)
        caromBoard.play(0, OutcomeType.STRIKE)
        caromBoard.play(0, OutcomeType.RED_STRIKE)

        assertEquals("Player 0 is winner", caromBoard.gameResult())
    }

    @Test
    fun `Should check if player 2 is winner`() {
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.RED_STRIKE)

        assertEquals("Player 1 is winner", caromBoard.gameResult())
    }

    @Test
    fun `Should check if game is draw`() {
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.RED_STRIKE)
        repeat(7) {
            caromBoard.play(1, OutcomeType.DEFUNCT_COIN)
        }

        assertEquals("It is a draw", caromBoard.gameResult())
    }

    @Test
    fun `Should check if game is not over`() {
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.RED_STRIKE)
        repeat(6) {
            caromBoard.play(1, OutcomeType.DEFUNCT_COIN)
        }

        assertEquals("Game is not over", caromBoard.gameResult())
    }
}
