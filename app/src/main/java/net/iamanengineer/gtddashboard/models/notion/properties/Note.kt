package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Note(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "select")
    val select: Any? = null,
    @Json(name = "type")
    val type: String? = null
)