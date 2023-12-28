package lol.ezra.ums

import lol.ezra.model.user.User
import lol.ezra.whatsapp.WhatsappSystem

object Authentication {
    private val otp = mutableMapOf<Long, String>()


    val loggedIn = mutableMapOf<String, User>()
    private val otpRange = (0 .. 9)
    private fun r() = otpRange.random()
    private fun generateOTP(): String {
        return "${r()}${r()}${r()}${r()}${r()}${r()}"
    }


    fun otp(number: Long) {
        val code = generateOTP()
        WhatsappSystem.sendMessage(number, "Your verification code is: $code")
        otp[number] = code
    }

    fun validateOTP(number: Long, code: String): Boolean {
        if (otp.containsKey(number))
            return false

        return otp[number] == code
    }
    fun logOut(number: Long){

    }

}