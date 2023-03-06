package com.clean_strike.board

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BoardConfigTest {
    @Test
    fun `Should decrement black coins by given value`() {
        val boardConfig = BoardConfig(5, 1)

        val newBoardConfig = boardConfig.decrementBlackCoinsBy(2)

        assertEquals(BoardConfig(3, 1), newBoardConfig)
    }

    @Test
    fun `Should decrement red coins by given value`() {
        val boardConfig = BoardConfig(5, 1)

        val newBoardConfig = boardConfig.decrementRedCoinsBy(1)

        assertEquals(BoardConfig(5, 0), newBoardConfig)
    }

    @Test
    fun `Should return true if board config is empty`() {
        val boardConfig = BoardConfig(0, 0)

        assertTrue(boardConfig.isBoardEmpty())
    }

    @Test
    fun `Should return false if board config is not empty`() {
        val boardConfig = BoardConfig(1, 0)

        assertFalse(boardConfig.isBoardEmpty())
    }
}
