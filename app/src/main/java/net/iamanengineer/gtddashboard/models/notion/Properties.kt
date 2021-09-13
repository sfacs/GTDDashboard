package net.iamanengineer.gtddashboard.models.notion


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import net.iamanengineer.gtddashboard.models.notion.properties.*

@JsonClass(generateAdapter = true)
data class Properties(
    @Json(name = "Bring up to meeting")
    val bringUpToMeeting: BringUpToMeeting? = null,
    @Json(name = "Context")
    val context: Context? = null,
    @Json(name = "Created")
    val created: Created? = null,
    @Json(name = "Delegate to")
    val delegateTo: DelegateTo? = null,
    @Json(name = "Do Date")
    val doDate: DoDate? = null,
    @Json(name = "Due Date")
    val dueDate: DueDate? = null,
    @Json(name = "Last Edited")
    val lastEdited: LastEdited? = null,
    @Json(name = "Name")
    val name: Name? = null,
    @Json(name = "Note")
    val note: Note? = null,
    @Json(name = "Priority")
    val priority: Priority? = null,
    @Json(name = "Project")
    val project: Project? = null,
    @Json(name = "Recurring")
    val recurring: Recurring? = null,
    @Json(name = "Relates to task(s)")
    val relatesToTasks: RelatesToTasks? = null,
    @Json(name = "Status")
    val status: Status? = null,
    @Json(name = "Trash")
    val trash: Trash? = null,
    @Json(name = "URL")
    val uRL: URL? = null,
    @Json(name = "Waiting for")
    val waitingFor: WaitingFor? = null
)