package meeee.ConstructorAutowired

import meeee.Moody
import meeee.MoodyHappy
import meeee.MoodySad
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MoodyConfig {

    @Bean
    fun getBeanMoodyHappy(): Moody {
        return MoodyHappy()
    }

    @Bean
    fun getBeanMoodySad(): Moody {
        return MoodySad()
    }
}