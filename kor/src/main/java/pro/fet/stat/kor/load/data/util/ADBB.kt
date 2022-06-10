package pro.fet.stat.kor.load.data.util

import android.app.Application
import android.provider.Settings

object ADBB {

    fun getAdbb(application: Application): Boolean{
        return Settings.Secure.getInt(
            application.contentResolver,
            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        ) != 0
    }
}