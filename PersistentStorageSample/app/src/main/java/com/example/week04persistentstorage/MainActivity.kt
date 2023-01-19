package com.example.week04persistentstorage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week04persistentstorage.databinding.ActivityMainBinding

const val PREFERENCES_FILE = "prefs"
const val USERNAME_KEY = "username"

class MainActivity : AppCompatActivity() {
    private lateinit var ui : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        val settings = getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE)
        ui.lblName.text = settings.getString(USERNAME_KEY, "default value")

        ui.txtName.setOnEditorActionListener { _, _, _ ->
            with (settings.edit()) {
                putString(USERNAME_KEY, ui.txtName.text.toString())
                apply()
            }
            true
        }
    }
}