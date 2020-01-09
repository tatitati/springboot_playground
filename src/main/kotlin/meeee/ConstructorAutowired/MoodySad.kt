package meeee.ConstructorAutowired

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class MoodySad: Moody{

    override fun shout(): String {
        return "im Moody sad"
    }

}