package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import net.iamanengineer.gtddashboard.models.notion.filter.operators.And

@JsonClass(generateAdapter = true)
data class Filter(
    @Json(name = "and")
    val and: List<And>
)