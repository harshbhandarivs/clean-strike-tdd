package com.clean_strike.output

class OutputInterfaceStub(val outputLines: MutableList<String?>): OutputInterface {
    override fun printLine(value: String?) {
        outputLines.add(value)
    }
}
