package meeee.AutowiredStudio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.web.bind.annotation.RestController
import javax.annotation.PostConstruct


// I have some beans defined in MoodyConfig, and I want to receive an specific

@SpringBootApplication
@RestController
class Main {

    @PostConstruct
    fun initialize() {
        val context = AnnotationConfigApplicationContext(MoodyConfig::class.java)
        val service: MyService  = context.getBean("getService", MyService::class.java)
        println(service.explain()) // im Moody happy
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}