package meeee.theater.control

import meeee.theater.service.BookingService
import meeee.theater.service.Theater
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
class ControllerWithValue {
    // DI properties
    @Value("\${coach.name}")
    lateinit var coachName: String

    @Value("\${team.name}")
    lateinit var teamName: String

    @GetMapping("/teamName")
    fun teamName(): String
    {
        return teamName
    }

    @GetMapping("/coachName")
    fun coachName(): String
    {
        return coachName
    }
}