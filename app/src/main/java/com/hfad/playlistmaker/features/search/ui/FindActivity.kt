package com.hfad.playlistmaker.features.search.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hfad.playlistmaker.R
import android.widget.ImageView

class FindActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)

        val backButton = findViewById<ImageView>(R.id.find_activity_arrow_back)
        backButton.setOnClickListener {
            // Закрываем текущую активность
            finish()
        }
    }
}
