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
}