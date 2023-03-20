package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.input.InputInterfaceStub
import com.clean_strike.output.OutputInterfaceImpl
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
            InputInterfaceStub(),
            OutputInterfaceImpl()
        )
        game.loop()
    }
}
