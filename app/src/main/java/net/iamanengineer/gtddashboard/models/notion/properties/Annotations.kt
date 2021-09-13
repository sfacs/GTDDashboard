package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Annotations(
    @Json(name = "bold")
    val bold: Boolean? = null,
    @Json(name = "code")
    val code: Boolean? = null,
    @Json(name = "color")
    val color: String? = null,
    @Json(name = "italic")
    val italic: Boolean? = null,
    @Json(name = "strikethrough")
    val strikethrough: Boolean? = null,
    @Json(name = "underline")
    val underline: Boolean? = null
)