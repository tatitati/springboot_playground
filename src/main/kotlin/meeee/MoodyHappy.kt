package meeee

import meeee.Moody
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class MoodyHappy: Moody {

    override fun shout(): String {
        return "im Moody happy"
    }

}