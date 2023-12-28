package lol.ezra.model

/**
 * Defines all of a user's permissions in an organization / event etc.
 */
class UserPermission(val roles: MutableList<Role>, val permissions: MutableList<Permission>) {

}