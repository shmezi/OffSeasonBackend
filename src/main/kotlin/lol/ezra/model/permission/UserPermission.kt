package lol.ezra.model.permission

/**
 * Defines all of a user's permissions in an organization / event etc.
 */
class UserPermission(val roles: MutableList<Role>, val permissions: MutableList<Permission>) {
    val compiled = mutableListOf(roles.map { it.permissions })
    fun hasPermissions(vararg permissions: Permission) {}
}