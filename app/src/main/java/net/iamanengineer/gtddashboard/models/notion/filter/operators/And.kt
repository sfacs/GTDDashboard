package net.iamanengineer.gtddashboard.models.notion.filter.operators


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import net.iamanengineer.gtddashboard.models.notion.filter.types.Checkbox
import net.iamanengineer.gtddashboard.models.notion.filter.types.Select

@JsonClass(generateAdapter = true)
data class And(
    @Json(name = "checkbox")
    val checkbox: Checkbox? = null,
    @Json(name = "or")
    val or: List<Or>? = null,
    @Json(name = "property")
    val `property`: String? = null,
    @Json(name = "select")
    val select: Select? = null
)