package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Text(
    @Json(name = "content")
    val content: String? = null,
    @Json(name = "link")
    val link: Any? = null
)