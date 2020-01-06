package meeee.theater.service

import meeee.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {

    fun isSeatFree(seat: Seat): Boolean {
        return true
    }
}