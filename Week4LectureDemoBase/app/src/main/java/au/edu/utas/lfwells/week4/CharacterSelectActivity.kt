package au.edu.utas.lfwells.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import au.edu.utas.lfwells.week4.databinding.ActivityCharacterSelectBinding

class CharacterSelectActivity : AppCompatActivity()
{
    private lateinit var ui : ActivityCharacterSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_select)

        ui = ActivityCharacterSelectBinding.inflate(layoutInflater)
        setContentView(ui.root)
    }
}