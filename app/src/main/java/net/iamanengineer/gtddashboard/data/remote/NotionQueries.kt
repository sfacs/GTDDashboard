package net.iamanengineer.gtddashboard.data.remote

import net.iamanengineer.gtddashboard.models.notion.NotionQuery
import net.iamanengineer.gtddashboard.models.notion.filter.operators.And
import net.iamanengineer.gtddashboard.models.notion.filter.operators.Or
import net.iamanengineer.gtddashboard.models.notion.filter.types.Checkbox
import net.iamanengineer.gtddashboard.models.notion.filter.types.NotionDate
import net.iamanengineer.gtddashboard.models.notion.filter.types.Select
import net.iamanengineer.gtddashboard.models.notion.properties.Filter
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class NotionQueries @Inject constructor() {
    private fun today() : String {
        val c: Date = Calendar.getInstance().getTime()
        val df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return df.format(c)
    }

    fun todayTodoQuery() = NotionQuery(
        filter = Filter(
            and = listOf(
                And(
                    or = listOf(
                        Or(
                            property = "Status",
                            select = Select(
                                equals = "To do"
                            )
                        ),
                        Or(
                            property = "Status",
                            select = Select(
                                equals = "Recurring"
                            )
                        ),
                        Or(
                            property = "Status",
                            select = Select(
                                equals = "Tickler"
                            )
                        )
                    )
                ),
                And(

                    or = listOf(
                        Or(
                            property = "Do Date",
                            date = NotionDate(
                                onOrBefore = today()
                            )
                        ),
                        Or(
                            property = "Due Date",
                            date = NotionDate(
                                onOrBefore = today()
                            )
                        ),
                    )
                ),
                And(
                    property = "Trash",
                    checkbox = Checkbox(
                        equals = false
                    )
                ),
                And(
                    property = "Note",
                    select = Select(
                        isEmpty = true
                    )
                )
            )
        )
    )


}