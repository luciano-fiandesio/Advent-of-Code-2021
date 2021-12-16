package com.lucianofiandesio.aoc2021

import com.lucianofiandesio.aoc2021.Utils.getResourceAsFile
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Day1 {

    @Test
    fun `first part`() {
        val count = getResourceAsFile("/day1/input").listOfInt()
            .windowed(2).count { (a, b) -> a < b }
        count shouldBe 1583
    }

    @Test
    fun `second part`()  {
        val count = getResourceAsFile("/day1/input").listOfInt()
            .windowed(4).count { it[0] < it[3] }
        count shouldBe 1627
    }
}