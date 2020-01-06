package meeee.theater.control

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @RequestMapping("showHellowWorld")
    fun helloWorld(): ModelAndView
    {
        return ModelAndView("helloWorld")
    }

    @RequestMapping("")
    fun homepage(): ModelAndView
    {
        return ModelAndView("seatBooking", "bean", CheckAvailabilityBackingBean())
    }
}

class CheckAvailabilityBackingBean{
    val seatNums = 1..36
    val seatRows = 'A'..'O'

    var selectedSeatNum: Int = 1
    var selectedSeatRow: Char = 'A'
    var result: String = ""
}