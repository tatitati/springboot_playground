package meeee.BeansStudio


class MoodyClient(val injectedMoody: Moody) {

    fun saySomething(): String {
        return injectedMoody.shout()
    }
}