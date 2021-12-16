package com.lucianofiandesio.aoc2021

import java.io.File

object Utils {

    fun getResourceAsFile(path: String):File {
        return File(Day1::class.java.getResource(path).toURI().path)
    }

    fun mapFileToListOfInt(file: File):List<Int> {
        return file.readLines().map { it.toInt() }
    }
}