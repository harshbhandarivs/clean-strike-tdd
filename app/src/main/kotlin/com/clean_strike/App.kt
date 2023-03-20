package com.clean_strike

import com.clean_strike.board.BoardConfig
import com.clean_strike.input.InputInterfaceImpl
import com.clean_strike.output.OutputInterfaceImpl
import com.clean_strike.player.PlayerStats

fun main() {
    val playerStatsMutableMap = mutableMapOf(0 to PlayerStats(0, 0, 0), 1 to PlayerStats(0, 0, 0))
    Game(BoardConfig(9, 1), playerStatsMutableMap, InputInterfaceImpl(), OutputInterfaceImpl()).loop()
}
