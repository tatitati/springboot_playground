package meeee.theater.control

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// how to inject from application.properties variables

@RestController
class ControllerWithValue {

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