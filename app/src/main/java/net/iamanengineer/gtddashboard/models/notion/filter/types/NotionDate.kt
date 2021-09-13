package net.iamanengineer.gtddashboard.models.notion.filter.types


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NotionDate(
    @Json(name = "on_or_before")
    val onOrBefore: String? = null
)