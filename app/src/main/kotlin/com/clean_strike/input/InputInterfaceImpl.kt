package com.clean_strike.input

class InputInterfaceImpl: InputInterface{
    override fun getNextLine(): String {
        return readln()
    }
}
