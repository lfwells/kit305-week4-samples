package au.edu.utas.lfwells.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import au.edu.utas.lfwells.week4.databinding.ActivityCharacterSelectBinding

const val REQUEST_CHARACTER = 0
const val RESPONSE_CANCELLED = 0
const val RESPONSE_SELECTED = 1
const val CHARACTER_NAME = "NAME"

class CharacterSelectActivity : AppCompatActivity(), View.OnClickListener
{
    private lateinit var ui : ActivityCharacterSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_select)

        ui = ActivityCharacterSelectBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.btnRick.setOnClickListener(this)
        ui.btnMorty.setOnClickListener(this)
        ui.btnJerry.setOnClickListener(this)
        ui.btnCancel.setOnClickListener(this)
    }

    override fun onClick(v: View?)
    {
        if (v == ui.btnCancel)
        {
            setResult(RESPONSE_CANCELLED)
        }
        else
        {
            val character = (v as Button).text
            val intent = Intent()
            intent.putExtra(CHARACTER_NAME, character)
            setResult(RESPONSE_SELECTED, intent)
        }
        finish()
    }
}