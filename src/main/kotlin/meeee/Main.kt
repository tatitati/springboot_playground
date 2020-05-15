package meeee

import com.simplybusiness.dna.common.spring.dynamo.DynamoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct


@Configuration
@ComponentScan("com.simplybusiness.dna.common.spring.dynamo")
class Config {
    @Bean
    fun item(): DynamoService {
        return DynamoService()
    }
}

@SpringBootApplication
class Main {

    @Value("\${coach.name}")
    lateinit var coachname: String

    @Autowired
    lateinit var service: DynamoService

    @PostConstruct
    fun initialize() {
        println(coachname)
        val sync = service.syncClient
        val a = 5
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}
