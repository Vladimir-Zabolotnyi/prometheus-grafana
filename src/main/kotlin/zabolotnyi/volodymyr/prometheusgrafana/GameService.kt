package zabolotnyi.volodymyr.prometheusgrafana

import io.micrometer.core.annotation.Timed
import org.springframework.stereotype.Service

@Service
class GameService(
    private val repository: GameRepository,
) {

    @Timed(value = "game.saved.time")
    fun saveGame(game: Game) =
        repository.save(game)

    fun findAll() =
        repository.findAll()
}
