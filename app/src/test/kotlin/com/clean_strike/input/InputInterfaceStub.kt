package com.clean_strike.input

class InputInterfaceStub : InputInterface {
    private val inputs = mutableListOf(0, 5, 1, 0, 2)
    override fun getNextLine(): String {
        return inputs.removeFirst().toString()
    }

}
