package lol.ezra.model.permission

enum class Permission {
    /**
     * Organizational Permissions:
     */
    /**
     * Manage users in the organization
     */
    O_MANAGE_USERS,

    /**
     * Manage events in the organization
     * Gives complete control to all events
     */
    O_MANAGE_EVENTS,

    /**
     * Event permissions
     */
    /**
     * Allows the invitation of new users to the event
     */
    E_Invite


}