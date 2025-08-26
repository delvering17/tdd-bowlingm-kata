package bowling

class Game {

    private val rolls = IntArray(21)
    private var currentRoll = 0

    fun roll(pins: Int) {
        rolls[currentRoll++] = pins
    }

    fun score(): Int {
        var score = 0
        var i = 0

        for (frame in 0 until 10) {
            if (rolls[i] + rolls[i + 1] == 10) {
                score += 10 + rolls[i + 2]
                i += 2
            } else {
                score += rolls[i] + rolls[i + 1]
                i += 2
            }
        }

        return score
    }

}
