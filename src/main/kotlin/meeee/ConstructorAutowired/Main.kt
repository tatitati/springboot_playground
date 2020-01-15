package meeee.ConstructorAutowired

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.web.bind.annotation.RestController
import javax.annotation.PostConstruct


// I check that MyService is constructed using the constructor that receives injected variables

@SpringBootApplication
@RestController
class Main {

    @Autowired
    lateinit var service: MyService

    @PostConstruct
    fun initialize() {
        println(service.explain()) // im Moody sad
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}