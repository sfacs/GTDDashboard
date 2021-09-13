package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MultiSelect(
    @Json(name = "color")
    val color: String? = null,
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "name")
    val name: String? = null
)