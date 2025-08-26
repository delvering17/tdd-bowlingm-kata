package bowling

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class BowlingGameTest {

    lateinit var game: Game

    @BeforeEach
    fun setUp() {
        game = Game()
    }

    @Test
    fun `gutter game`() {
        rollMany(20, 0)

        assertThat(game.score()).isEqualTo(0)
    }

    @Test
    fun `all ones`() {
        rollMany(20, 1)

        assertThat(game.score()).isEqualTo(20)

    }

    private fun rollMany(n: Int, pins: Int) {
        repeat(n) {
            game.roll(pins)
        }
    }

}