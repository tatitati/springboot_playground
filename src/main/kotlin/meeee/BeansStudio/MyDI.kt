package meeee.BeansStudio

class MyDI(val injected: Moody) {

    fun speak(): String {
        return injected.shout()
    }
}