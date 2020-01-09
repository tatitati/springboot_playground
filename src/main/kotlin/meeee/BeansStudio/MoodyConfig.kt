package meeee.BeansStudio

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MoodyConfig {

    @Bean
    fun getBeanMoodyHappy(): MoodyHappy{
        return MoodyHappy()
    }

    @Bean
    fun getBeanMoodySad(): MoodySad{
        return MoodySad()
    }
}