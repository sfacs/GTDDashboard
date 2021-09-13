package net.iamanengineer.gtddashboard.models.notion.filter.operators


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import net.iamanengineer.gtddashboard.models.notion.filter.types.Date
import net.iamanengineer.gtddashboard.models.notion.filter.types.Select

@JsonClass(generateAdapter = true)
data class Or(
    @Json(name = "date")
    val date: Date? = null,
    @Json(name = "property")
    val `property`: String? = null,
    @Json(name = "select")
    val select: Select? = null
)