package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.input.InputInterfaceImpl
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test

class GameTest {
    @Test
    fun `Should be able to run`() {
        val game = Game(
            BoardConfig(9, 1),
            mutableMapOf(
                0 to PlayerStats(0, 0, 0),
                1 to PlayerStats(0, 0, 0)
            ),
            InputInterfaceImpl()
        )
        game.loop()
    }
}
