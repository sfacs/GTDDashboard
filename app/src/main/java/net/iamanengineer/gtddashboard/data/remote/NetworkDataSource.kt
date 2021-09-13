package net.iamanengineer.gtddashboard.data.remote

import com.squareup.moshi.Moshi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.iamanengineer.gtddashboard.models.notion.NotionPage
import net.iamanengineer.gtddashboard.models.notion.NotionQuery
import net.iamanengineer.gtddashboard.models.notion.filter.*
import javax.inject.Inject

class NetworkDataSource @Inject constructor(private val notionService: NotionService,
                                            private val notionQueries: NotionQueries) {

    suspend fun getTodoToday(): Flow<List<NotionPage>> {

        return flow {
            val response = notionService.getDatabase(MY_TASKS_DB, notionQueries.todayTodoQuery())
            emit(response)
        }
    }

    companion object {
        const val MY_TASKS_DB = "31fa59ad92634d418d1834c711435e4e"
    }

}