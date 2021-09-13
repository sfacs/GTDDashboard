package net.iamanengineer.gtddashboard.models.notion.properties


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Parent(
    @Json(name = "database_id")
    val databaseId: String? = null,
    @Json(name = "type")
    val type: String? = null
)