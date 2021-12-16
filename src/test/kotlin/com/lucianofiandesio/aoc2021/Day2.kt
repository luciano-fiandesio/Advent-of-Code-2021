package com.lucianofiandesio.aoc2021

import com.lucianofiandesio.aoc2021.Utils.getResourceAsFile
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day2 {

    @Test
    fun solution_first_part() {
        val result = getResourceAsFile("/day2/input").readLines().fold(Pair(0,0)) { acc, line ->
            when (line.substring(0,1)) {
                "f" -> Pair(acc.first + line.extractInt(), acc.second)
                "u" -> Pair(acc.first, acc.second - line.extractInt())
                "d" -> Pair(acc.first, acc.second + line.extractInt())
                else -> throw RuntimeException("invalid: " + line.substring(0,1))
            }
        }.let { it.first * it.second }

        result shouldBe 1480518
    }
}