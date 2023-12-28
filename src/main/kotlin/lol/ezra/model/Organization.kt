package lol.ezra.model

import lol.ezra.model.events.Event
import lol.ezra.model.permission.Role
import lol.ezra.model.permission.UserPermission
import lol.ezra.model.user.User
import org.bson.codecs.pojo.annotations.BsonId


data class Organization(
    @BsonId
    val name: String,
    var owner: User,
    val roles: MutableMap<String, Role>, //RoleName - Role
    val members: MutableMap<String, UserPermission>, //UserId - Permissions
    val events: MutableMap<String, Event> //EventId - Event
) {
    /**
     * Invites a user to the organization
     */
    fun inviteUser() {}
}