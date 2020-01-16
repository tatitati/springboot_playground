package meeee.profilesStudio

import org.springframework.context.annotation.Profile
import meeee.MoodyHappy
import meeee.MoodySad
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@Profile("test")
class MoodyConfigTest {
    @Bean
    fun getBeanMoodyHappy(): MoodyHappy {
        return MoodyHappy()
    }

    @Bean
    fun getBeanMoodySad(): MoodySad {
        return MoodySad()
    }
}