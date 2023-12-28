package lol.ezra.model.permission

/**
 * Defines a role for an organization/event
 * @param roleType - The role types
 */
class Role(
    var roleType: List<RoleType>,
    vararg var permissions: Permission,
) {

    fun hasPermissions(vararg permissions: Permission): Boolean {
        for (permission in permissions) {
            if (!permissions.contains(permission))
                return false
        }
        return true
    }
}