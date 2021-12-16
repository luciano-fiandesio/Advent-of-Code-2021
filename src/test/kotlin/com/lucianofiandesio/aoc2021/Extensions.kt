package com.lucianofiandesio.aoc2021

import java.io.File

fun File.listOfInt(): List<Int> {
    return this.readLines().map { it.toInt() }
}

fun String.extractInt(): Int {
    return this.filter { it.isDigit() }.toInt()
}