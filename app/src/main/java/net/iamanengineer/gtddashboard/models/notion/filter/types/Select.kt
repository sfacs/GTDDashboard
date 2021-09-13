package net.iamanengineer.gtddashboard.models.notion.filter.types


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Select(
    @Json(name = "equals")
    val equals: String? = null,
    @Json(name = "is_empty")
    val isEmpty: Boolean? = null
)