package meeee.DiStudio

class MyDI(val injected: Moody) {

    fun speak(): String {
        return injected.shout()
    }
}