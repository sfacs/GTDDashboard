package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class URL(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "url")
    val url: Any? = null
)