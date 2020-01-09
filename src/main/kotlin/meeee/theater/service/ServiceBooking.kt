package meeee.theater.service

import meeee.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class ServiceBooking() {

    fun isSeatFree(seat: Seat): Boolean {
        return true
    }
}