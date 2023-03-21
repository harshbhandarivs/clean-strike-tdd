package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.input.InputInterfaceStub
import com.clean_strike.output.OutputInterfaceStub
import com.clean_strike.player.PlayerStats
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class GameTest {
    @Test
    fun `Should be able to run`() {
        val outputInterface = OutputInterfaceStub(mutableListOf())
        val game = Game(
            BoardConfig(9, 1),
            mutableMapOf(
                0 to PlayerStats(0, 0, 0),
                1 to PlayerStats(0, 0, 0)
            ),
            InputInterfaceStub(),
            outputInterface
        )
        game.loop()
        assertContentEquals(
            mutableListOf(
                "0. STRIKE",
                "1. MULTI_STRIKE",
                "2. RED_STRIKE",
                "3. STRIKER_STRIKE",
                "4. DEFUNCT_COIN",
                "5. NONE",
                "Player 0, Pick a choice",
                "Successful Play",
                "0. STRIKE",
                "1. MULTI_STRIKE",
                "2. RED_STRIKE",
                "3. STRIKER_STRIKE",
                "4. DEFUNCT_COIN",
                "5. NONE",
                "Player 1, Pick a choice",
                "Successful Play",
                "0. STRIKE",
                "1. MULTI_STRIKE",
                "2. RED_STRIKE",
                "3. STRIKER_STRIKE",
                "4. DEFUNCT_COIN",
                "5. NONE",
                "Player 0, Pick a choice",
                "Successful Play",
                "0. STRIKE",
                "1. MULTI_STRIKE",
                "2. RED_STRIKE",
                "3. STRIKER_STRIKE",
                "4. DEFUNCT_COIN",
                "5. NONE",
                "Player 1, Pick a choice",
                "Successful Play",
                "0. STRIKE",
                "1. MULTI_STRIKE",
                "2. RED_STRIKE",
                "3. STRIKER_STRIKE",
                "4. DEFUNCT_COIN",
                "5. NONE",
                "Player 0, Pick a choice",
                "Successful Play",
                "Player 0 is winner"
            ), outputInterface.outputLines
        )
    }
}
