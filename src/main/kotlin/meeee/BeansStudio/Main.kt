package meeee.BeansStudio

import meeee.Moody
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.web.bind.annotation.RestController
import javax.annotation.PostConstruct

@SpringBootApplication
@RestController
class Main {

    @PostConstruct
    fun initialize() {
        val context = AnnotationConfigApplicationContext(MoodyConfig::class.java)

        // I want to receive an specific bean by the name of the function
        val happy: Moody = context.getBean("getBeanMoodySad", Moody::class.java)

        println(happy.shout()) // im Moody sad
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}