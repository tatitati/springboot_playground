package meeee.BeansStudio

import org.springframework.stereotype.Component

@Component
class MoodySad: Moody{
    override fun shout(): String {
        return "im Moody sad"
    }

}