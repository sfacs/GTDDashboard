package net.iamanengineer.gtddashboard.models.notion.moshiadapters

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonClass
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson
import net.iamanengineer.gtddashboard.models.notion.NotionPage

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class WrappedPageList

@JsonClass(generateAdapter = true)
data class PageList(val results: List<NotionPage>)

class NotionPageListJsonAdapter {
    @WrappedPageList
    @FromJson
    fun fromJson(json: PageList): List<NotionPage> {
        return json.results
    }

    @ToJson
    fun toJson(@WrappedPageList value: List<NotionPage>): PageList {
        throw UnsupportedOperationException()
    }
}