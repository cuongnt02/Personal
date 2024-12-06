import androidx.lifecycle.ViewModel
import com.ntc.personal.PersonalRecord
import java.time.LocalDate

class RecordViewModel : ViewModel() {

    private val record = PersonalRecord(title="A day in the backyard", content="Chillin' in the backyard!", date= LocalDate.now())


    val recordTitle: String
        get() = record.title

    val recordContent: String
        get() = record.content

    val recordDate: LocalDate
        get() = record.date

}