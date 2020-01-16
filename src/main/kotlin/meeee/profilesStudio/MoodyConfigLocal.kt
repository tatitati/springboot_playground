package meeee.profilesStudio

import meeee.MoodyHappy
import meeee.MoodySad
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("local")
class MoodyConfigLocal {

    @Bean
    fun getBeanMoodyHappy(): MoodyHappy {
        return MoodyHappy()
    }

    @Bean
    fun getBeanMoodySad(): MoodySad {
        return MoodySad()
    }
}