package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WaitingFor(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "rich_text")
    val richText: List<Any>? = null,
    @Json(name = "type")
    val type: String? = null
)