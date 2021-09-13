package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BringUpToMeeting(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "relation")
    val relation: List<Any>? = null,
    @Json(name = "type")
    val type: String? = null
)