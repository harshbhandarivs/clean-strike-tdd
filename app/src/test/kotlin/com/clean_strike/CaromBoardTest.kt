package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.outcome.OutcomeType
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CaromBoardTest {
    @Test
    fun `Should check if player 1 is winner`() {
        val caromBoard = CaromBoard(
            BoardConfig(9, 1),
            PlayerStats(0, 0, 0),
            PlayerStats(0, 0, 0)
        )

        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.RED_STRIKE)

        assertEquals("Player 1 is winner", caromBoard.gameResult())
    }

    @Test
    fun `Should check if player 2 is winner`() {
        val caromBoard = CaromBoard(
            BoardConfig(9, 1),
            PlayerStats(0, 0, 0),
            PlayerStats(0, 0, 0)
        )

        caromBoard.play(2, OutcomeType.STRIKE)
        caromBoard.play(2, OutcomeType.STRIKE)
        caromBoard.play(2, OutcomeType.RED_STRIKE)

        assertEquals("Player 2 is winner", caromBoard.gameResult())
    }

    @Test
    fun `Should check if game is draw`() {
        val caromBoard = CaromBoard(
            BoardConfig(9, 1),
            PlayerStats(0, 0, 0),
            PlayerStats(0, 0, 0)
        )

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
        val caromBoard = CaromBoard(
            BoardConfig(9, 1),
            PlayerStats(0, 0, 0),
            PlayerStats(0, 0, 0)
        )

        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.STRIKE)
        caromBoard.play(1, OutcomeType.RED_STRIKE)
        repeat(6) {
            caromBoard.play(1, OutcomeType.DEFUNCT_COIN)
        }

        assertEquals("Game is not over", caromBoard.gameResult())
    }
}