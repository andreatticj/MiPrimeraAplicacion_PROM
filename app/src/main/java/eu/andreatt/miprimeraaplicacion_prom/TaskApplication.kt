package eu.andreatt.miprimeraaplicacion_prom

import android.app.Application

class TaskApplication:Application() {

    companion object{
        lateinit var prefs:Preferences
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Preferences(baseContext)
    }
}