package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Name(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "title")
    val title: List<Title>? = null,
    @Json(name = "type")
    val type: String? = null
)