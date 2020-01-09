package meeee.AutowiredStudio

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MoodyConfig {

    @Bean
    fun getService(): MyService{
        return MyService()
    }

    @Bean
    fun getBeanMoodyHappy(): MoodyHappy {
        return MoodyHappy()
    }

    @Bean
    fun getBeanMoodySad(): MoodySad {
        return MoodySad()
    }
}