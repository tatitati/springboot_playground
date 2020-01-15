package meeee.AutowiredStudio

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

        // I want to test if in MyService is constructed injecting on it MoodyHappy behind the scenes
        val service: MyService  = context.getBean("getService", MyService::class.java)

        println(service.explain()) // im Moody happy
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}