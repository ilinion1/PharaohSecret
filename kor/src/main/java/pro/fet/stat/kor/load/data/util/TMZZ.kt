package pro.fet.stat.kor.load.data.util

import android.app.Application
import java.util.*

class TMZZ() {

    fun getTmzz(): String{
        return TimeZone.getDefault().id
    }
}