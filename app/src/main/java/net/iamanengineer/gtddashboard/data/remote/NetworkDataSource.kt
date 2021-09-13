package net.iamanengineer.gtddashboard.data.remote

import com.squareup.moshi.Moshi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.iamanengineer.gtddashboard.data.remote.NotionQueries.Companion.TODAY_TODO
import net.iamanengineer.gtddashboard.models.notion.NotionPage
import net.iamanengineer.gtddashboard.models.notion.NotionQuery
import net.iamanengineer.gtddashboard.models.notion.filter.*
import javax.inject.Inject

class NetworkDataSource @Inject constructor(private val notionService: NotionService, private val moshi: Moshi) {

    suspend fun getTodoToday(): Flow<List<NotionPage>> {

        return flow {
            val response = notionService.getDatabase("31fa59ad92634d418d1834c711435e4e", TODAY_TODO)
            emit(response)
        }
    }

}