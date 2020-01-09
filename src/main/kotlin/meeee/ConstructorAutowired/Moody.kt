package meeee.ConstructorAutowired

import org.springframework.stereotype.Component

@Component
interface Moody {
    fun shout(): String
}