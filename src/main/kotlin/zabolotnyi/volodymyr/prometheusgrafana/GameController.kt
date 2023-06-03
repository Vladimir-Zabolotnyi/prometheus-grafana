package zabolotnyi.volodymyr.prometheusgrafana

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController(
    private val gameService: GameService,
) {

    @PostMapping("/games/post")
    fun addGame() =
        gameService.saveGame(Game(name = "id"))

    @GetMapping("/games/get")
    fun get() =
        gameService.findAll()
}
