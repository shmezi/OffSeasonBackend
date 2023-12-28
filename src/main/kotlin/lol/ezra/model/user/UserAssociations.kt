package lol.ezra.model.user

/**
 * A user's Association to Events, teams etc
 * @param teams - List of Concrete teams associated with.
 * @param organizations - List of organizations associated with
 * @param volunteers - List of events assossiated
 */
data class UserAssociations(
    val teams: MutableList<String>,
    val organizations: MutableList<String>,
    val volunteers: MutableList<String>
)