package lol.ezra.db

/**
 * The use of standard get functions for getting actual data not the id in objects should run through this to ensure all the data is cached.
 */
object CachingSoftware {
    private val caching = mutableMapOf<String, Any>()

    private fun <T> retriveFromDB(id: String): T {
        TODO()
    }

    fun <T> get(id: String): T {
        if (caching.containsKey(id)) return caching[id] as T
        return retriveFromDB(id)
    }

    fun uncache(id: String) {
        caching.remove(id)
    }

}