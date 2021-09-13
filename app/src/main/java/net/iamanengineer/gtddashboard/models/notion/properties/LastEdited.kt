package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LastEdited(
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "last_edited_time")
    val lastEditedTime: String? = null,
    @Json(name = "type")
    val type: String? = null
)