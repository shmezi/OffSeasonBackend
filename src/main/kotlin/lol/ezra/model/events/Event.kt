package lol.ezra.model.events

import lol.ezra.model.permission.UserPermission
import org.bson.codecs.pojo.annotations.BsonId

data class Event(
    @BsonId
    val id: String,
    var name: String,
    val teams: MutableMap<String, EventTeam>, //teamId team
    val members: MutableList<String>,
) {

}