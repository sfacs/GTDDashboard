package net.iamanengineer.gtddashboard.data.remote

import net.iamanengineer.gtddashboard.models.notion.NotionPage
import net.iamanengineer.gtddashboard.models.notion.NotionQuery
import net.iamanengineer.gtddashboard.models.notion.moshiadapters.WrappedPageList
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface NotionService {

    @POST("/v1/databases/{id}/query")
    @WrappedPageList
    suspend fun getDatabase(@Path("id") id:String, @Body query: NotionQuery): List<NotionPage>

}