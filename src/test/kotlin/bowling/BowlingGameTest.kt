package bowling

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class BowlingGameTest {

    @Test
    fun `gutter game`() {
        val game = Game()
        repeat(20) {
            game.roll(0)
        }

        assertThat(game.score()).isEqualTo(0)
    }

    @Test
    fun `all ones`() {
        val game = Game()
        repeat(20) {
            game.roll(1)
        }

        assertThat(game.score()).isEqualTo(20)

    }

}