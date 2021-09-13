package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Context(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "multi_select")
    val multiSelect: List<MultiSelect>? = null,
    @Json(name = "type")
    val type: String? = null
)