package meeee.ConstructorAutowired

import meeee.Moody
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class MyService(@Qualifier("getBeanMoodyHappy") val myinjected: Moody){

    fun explain(): String{
        return myinjected.shout()
    }
}