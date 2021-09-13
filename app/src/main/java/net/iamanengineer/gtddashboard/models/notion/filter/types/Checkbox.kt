package net.iamanengineer.gtddashboard.models.notion.filter.types


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Checkbox(
    @Json(name = "equals")
    val equals: Boolean? = null
)