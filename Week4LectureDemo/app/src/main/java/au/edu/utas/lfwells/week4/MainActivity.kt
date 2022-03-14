package au.edu.utas.lfwells.week4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import au.edu.utas.lfwells.week4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var ui : ActivityMainBinding

    //we need to register each activity-result pair that we will use
    private val getCharacter = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        if (result.resultCode == RESPONSE_CANCELLED)
        {
            ui.txtCharacterName.text = "You cancelled, you monster!"
        }
        else
        {
            val character = result.data!!.getStringExtra(CHARACTER_NAME)
            ui.txtCharacterName.text = character
        }
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.btnCharacterSelect.setOnClickListener {
            var intent = Intent(this, CharacterSelectActivity::class.java) //this line is the same as the tutorials
            getCharacter.launch(intent)
        }
    }
}