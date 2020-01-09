package meeee.DiStudio

import org.springframework.stereotype.Component

@Component
class MoodyHappy: Moody {
    override fun shout(): String {
        return "im Moody happy"
    }

}