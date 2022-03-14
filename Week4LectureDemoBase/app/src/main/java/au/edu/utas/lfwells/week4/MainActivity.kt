package au.edu.utas.lfwells.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import au.edu.utas.lfwells.week4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var ui : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
    }
}