package meeee.theater

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import javax.validation.constraints.AssertTrue

@SpringBootTest
class AnotherTests {

    @Test
    fun contextLoads() {
        assertEquals(3, 3)
    }
}
