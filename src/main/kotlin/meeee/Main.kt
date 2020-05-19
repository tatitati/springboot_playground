package meeee

import com.simplybusiness.dna.common.spring.dynamo.DynamoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct


@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.simplybusiness.dna.common.spring.dynamo"))
class Main @Autowired constructor(
        val service: DynamoService
) {

    @PostConstruct
    fun initialize() {
        val sync = service
        val a = 4
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}
