fun main() {
    fun part1(input: List<String>): Int {
        var total = 0;
        for (l in input) {
            var left: Char? = null;
            var right: Char? = null;
            for (c in l) {
                if (c.isDigit()) {
                    if (left == null) {
                        left = c
                    } else {
                        right = c
                    }
                }
            }
            total += ("" + left + (right ?: left)).toInt()
        }
        return total
    }

    fun part2(input: List<String>): Int {
        var total = 0;
        for (l in input) {
            var left: Char? = null;
            var right: Char? = null;
            for ((i, c) in l.withIndex()) {
                if (c.isDigit()) {
                    if (left == null) {
                        left = c
                    } else {
                        right = c
                    }
                } else {
                    var num: Int? = null
                    if (l.startsWith("one", i)) {
                        num = 1
                    } else if (l.startsWith("two", i)) {
                        num = 2
                    } else if (l.startsWith("three", i)) {
                        num = 3
                    } else if (l.startsWith("four", i)) {
                        num = 4
                    } else if (l.startsWith("five", i)) {
                        num = 5
                    } else if (l.startsWith("six", i)) {
                        num = 6
                    } else if (l.startsWith("seven", i)) {
                        num = 7
                    } else if (l.startsWith("eight", i)) {
                        num = 8
                    } else if (l.startsWith("nine", i)) {
                        num = 9
                    } else if (l.startsWith("ten", i)) {
                        num = 10
                    }
                    if (num != null) {
                        if (left == null) {
                            left = num.toString()[0]
                        } else {
                            right = num.toString()[0]
                        }
                    }
                }
            }
            total += ("" + left + (right ?: left)).toInt()
        }
        return total
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 142)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
