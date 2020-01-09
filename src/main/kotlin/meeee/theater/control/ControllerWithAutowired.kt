package meeee.theater.control

import meeee.theater.service.ServiceBooking
import meeee.theater.service.ServiceTheater
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class ControllerWithAutowired {

    @Autowired
    lateinit var theaterService: ServiceTheater

    @Autowired
    lateinit var bookingService: ServiceBooking

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

    @RequestMapping("checkAvailability", method=arrayOf(RequestMethod.POST))
    fun checkAvailability(bean: CheckAvailabilityBackingBean): ModelAndView {
        val selectedSeat = theaterService.find(bean.selectedSeatNum, bean.selectedSeatRow)
        val isFree = bookingService.isSeatFree(selectedSeat)
        bean.result = "Seat $selectedSeat is" + if(isFree) "available" else "booked"

        return ModelAndView("seatBooking", "bean", bean)
    }

}

class CheckAvailabilityBackingBean{
    val seatNums = 1..36
    val seatRows = 'A'..'O'

    var selectedSeatNum: Int = 1
    var selectedSeatRow: Char = 'A'
    var result: String = ""
}