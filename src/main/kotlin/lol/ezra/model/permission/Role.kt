package lol.ezra.model

class Role(
    val name: String,
    vararg val permissions: Permission
) {
}