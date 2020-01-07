package meeee.theater.control;

import meeee.theater.service.FortuneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
class ControllerQualifier {

    @Autowired
    @Qualifier("happyFortuneService")
    lateinit var fortuneService: FortuneService

    @GetMapping("/tryQualifier")
    fun tryQualifier(): String
    {
        return fortuneService.fortune
    }
}
