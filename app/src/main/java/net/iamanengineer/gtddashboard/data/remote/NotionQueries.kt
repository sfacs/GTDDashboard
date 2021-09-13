package net.iamanengineer.gtddashboard.data.remote

import net.iamanengineer.gtddashboard.models.notion.NotionQuery
import net.iamanengineer.gtddashboard.models.notion.filter.operators.And
import net.iamanengineer.gtddashboard.models.notion.filter.operators.Or
import net.iamanengineer.gtddashboard.models.notion.filter.types.Checkbox
import net.iamanengineer.gtddashboard.models.notion.filter.types.Date
import net.iamanengineer.gtddashboard.models.notion.filter.types.Select
import net.iamanengineer.gtddashboard.models.notion.properties.Filter

class NotionQueries {
    companion object {
        val TODAY_TODO = NotionQuery(
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
                                date = Date(
                                    onOrBefore = "2021-09-12"
                                )
                            ),
                            Or(
                                property = "Due Date",
                                date = Date(
                                    onOrBefore = "2021-09-12"
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

}