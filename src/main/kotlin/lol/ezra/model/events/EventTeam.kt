package lol.ezra.model.events

/**
 * Represents a team for an event.
 * NOTE, DO NOT CONFUSE WITH AN ACTUAL CONCRETE TEAM!
 */
data class EventTeam(
    val concreteID: String,
    var name: String,
    val number: Int,
    var logo: String? = null
) {
}