package zabolotnyi.volodymyr.prometheusgrafana

import io.micrometer.core.aop.TimedAspect
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TimedConfiguration {

    @Bean
    fun timedAspect(registry: MeterRegistry): TimedAspect =
        TimedAspect(registry)
}
