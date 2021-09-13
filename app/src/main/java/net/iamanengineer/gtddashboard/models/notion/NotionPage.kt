package net.iamanengineer.gtddashboard.models.notion


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import net.iamanengineer.gtddashboard.models.notion.properties.Parent

@JsonClass(generateAdapter = true)
data class NotionPage(
    @Json(name = "archived")
    val archived: Boolean? = null,
    @Json(name = "cover")
    val cover: Any? = null,
    @Json(name = "created_time")
    val createdTime: String? = null,
    @Json(name = "icon")
    val icon: Any? = null,
    @Json(name = "id")
    val id: String? = null,
    @Json(name = "last_edited_time")
    val lastEditedTime: String? = null,
    @Json(name = "object")
    val objectX: String? = null,
    @Json(name = "parent")
    val parent: Parent? = null,
    @Json(name = "properties")
    val properties: Properties? = null,
    @Json(name = "url")
    val url: String? = null
)