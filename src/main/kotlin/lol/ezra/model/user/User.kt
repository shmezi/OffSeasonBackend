package lol.ezra.model.user

import lol.ezra.model.user.UserAssociations
import org.bson.codecs.pojo.annotations.BsonId
import java.util.UUID

/**
 * Defines a user
 * User is a data driven model using the [associations] as the types.
 * @param personalID - The user's real country ID. TODO: This system eventually should allow multiple types of ides rather than just ssn and tz.
 * @param names - <
 */
class User(
    @BsonId
    val personalID: String,
    val names: MutableMap<String, LocalName>,
    var associations: UserAssociations,
    var phone: String,
    var email: String? = null
)