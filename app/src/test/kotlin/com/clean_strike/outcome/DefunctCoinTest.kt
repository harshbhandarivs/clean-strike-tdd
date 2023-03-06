package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DefunctCoinTest {
    @Test
    fun `Should implement defunct coin outcome`() {
        val strike = DefunctCoin()
        val playerStats = PlayerStats(2, 1, 1)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 2, 2), newPlayerStats)
    }

    @Test
    fun `Should implement defunct coin outcome with already two consecutive zero`() {
        val strike = DefunctCoin()
        val playerStats = PlayerStats(3, 1, 2)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 2, 0), newPlayerStats)
    }

    @Test
    fun `Should implement defunct coin outcome with already two fouls`() {
        val strike = DefunctCoin()
        val playerStats = PlayerStats(4, 2, 2)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(0, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should invalidate board config for outcome`() {
        val defunctCoin = DefunctCoin()
        val boardConfig = BoardConfig(0, 0)

        assertFalse(defunctCoin.isBoardConfigValid(boardConfig))
    }

    @Test
    fun `Should validate board config for outcome`() {
        val defunctCoin = DefunctCoin()
        val boardConfig = BoardConfig(1, 0)

        assertTrue(defunctCoin.isBoardConfigValid(boardConfig))
    }

    @Test
    fun `Should decrement number of black coin by one`() {
        val strike = DefunctCoin()
        val boardConfig = BoardConfig(1, 0)
        val newBoardConfig = strike.calculateNewBoardConfig(boardConfig)

        assertEquals(BoardConfig(0, 0), newBoardConfig)
    }
}
