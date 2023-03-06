package com.clean_strike.outcome

import com.clean_strike.board.BoardConfig
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StrikeTest {
    @Test
    fun `Should implement Single Strike outcome by incrementing score by 1`() {
        val strike = Strike()
        val playerStats = PlayerStats(0, 0, 0)

        val newPlayerStats = strike.calculateNewPlayerStats(playerStats)

        assertEquals(PlayerStats(1, 0, 0), newPlayerStats)
    }

    @Test
    fun `Should invalidate board config for outcome`() {
        val strike = Strike()
        val boardConfig = BoardConfig(0, 0)

        assertFalse(strike.isBoardConfigValid(boardConfig))
    }


    @Test
    fun `Should validate board config for outcome`() {
        val strike = Strike()
        val boardConfig = BoardConfig(1, 0)

        assertTrue(strike.isBoardConfigValid(boardConfig))
    }


    @Test
    fun `Should decrement number of black coin by one`() {
        val strike = Strike()
        val boardConfig = BoardConfig(1, 1)
        val newBoardConfig = strike.calculateNewBoardConfig(boardConfig)

        assertEquals(BoardConfig(0, 1), newBoardConfig)
    }
}