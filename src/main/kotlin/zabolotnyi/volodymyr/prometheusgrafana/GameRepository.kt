package zabolotnyi.volodymyr.prometheusgrafana

import org.springframework.data.jpa.repository.JpaRepository

interface GameRepository : JpaRepository<Game, Long>
