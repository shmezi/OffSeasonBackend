package lol.ezra.whatsapp

import it.auties.whatsapp.api.QrHandler
import it.auties.whatsapp.api.WebHistoryLength
import it.auties.whatsapp.api.Whatsapp
import it.auties.whatsapp.model.contact.ContactJid
import lol.ezra.ums.Authentication


object WhatsappSystem {


    val whatsapp =
        Whatsapp.webBuilder().lastConnection().name("Off-Season Backend").autodetectListeners(true).historyLength(
            WebHistoryLength.STANDARD
        ).unregistered(QrHandler.toTerminal()).connect().join()

    fun getContact(number: Long): ContactJid {
        return whatsapp.store().findContactByJid(ContactJid.of(number)).get().jid()
    }

    fun createContact(number: Long): ContactJid {
        return whatsapp.store().addContact(ContactJid.of(number)).jid()
    }

    fun createContacts(vararg numbers: Long): List<ContactJid> {
        return numbers.map { whatsapp.store().addContact(ContactJid.of(it)).jid() }
    }


    fun createGroup(name: String, vararg participants: Long) {
        whatsapp.createGroup(name, *createContacts(*participants).toTypedArray())
    }


    fun sendMessage(number: Long, message: String) {
        whatsapp.sendMessage(getContact(number), message)

    }


}

fun main() {
    Authentication.otp(972584819414)

}