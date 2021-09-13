package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Title(
    @Json(name = "annotations")
    val annotations: Annotations? = null,
    @Json(name = "href")
    val href: Any? = null,
    @Json(name = "plain_text")
    val plainText: String? = null,
    @Json(name = "text")
    val text: Text? = null,
    @Json(name = "type")
    val type: String? = null
)