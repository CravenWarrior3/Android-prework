package ecooper.androidprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Log and show a message when the button is clicked
        val button = findViewById<Button>(R.id.introButton)
        button.setOnClickListener {
            Log.v("Hello world", "Button clicked")
            Toast.makeText(this, getString(R.string.buttonMessage), Toast.LENGTH_SHORT).show()
        }
    }
}