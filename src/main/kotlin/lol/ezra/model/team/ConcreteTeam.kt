package lol.ezra.model.team

import lol.ezra.model.user.User
import org.bson.codecs.pojo.annotations.BsonId

data class ConcreteTeam(
    @BsonId
    val id: Long,
    var name: String,
    var owner: User,
    val members: MutableList<String>, //UserIds
    val teams: MutableMap<String, String>,//OrganizationId Team Id
    var logo: String? = null
) {
}