package lol.ezra.model.permission

/**
 * Roles are created per oraganization and can be created for handling either event permissions and or organization permissions
 */
enum class RoleType {
    /**
     * Permission used for the organization
     */
    ORGANIATION,

    /**
     * Permission used for an [Event]
     */
    EVENT
}