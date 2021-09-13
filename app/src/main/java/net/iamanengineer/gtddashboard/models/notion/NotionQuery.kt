package net.iamanengineer.gtddashboard.models.notion


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import net.iamanengineer.gtddashboard.models.notion.properties.Filter

@JsonClass(generateAdapter = true)
data class NotionQuery(
    @Json(name = "filter")
    val filter: Filter
)