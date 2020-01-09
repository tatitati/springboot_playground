package meeee.theater.control;

import meeee.theater.service.ServiceFortune
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
class ControllerQualifier {

    @Autowired
    @Qualifier("serviceHappyFortune")
    lateinit var fortuneService: ServiceFortune

    @GetMapping("/tryQualifier")
    fun tryQualifier(): String
    {
        return fortuneService.fortune
    }
}
