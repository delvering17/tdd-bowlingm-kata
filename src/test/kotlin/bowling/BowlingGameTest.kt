package bowling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

// gutter game: 0
class BowlingGameTest {

    @Test
    fun `gutter game`() {
        val game = Game()
        repeat(20) {
            game.roll(0)
        }

        assertThat(game.score()).isEqualTo(0)
    }

}