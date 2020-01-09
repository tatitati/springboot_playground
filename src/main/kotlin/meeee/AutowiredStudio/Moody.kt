package meeee.AutowiredStudio

import org.springframework.stereotype.Component

@Component
interface Moody {
    fun shout(): String
}